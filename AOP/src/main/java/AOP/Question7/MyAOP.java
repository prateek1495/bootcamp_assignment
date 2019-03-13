package AOP.Question7;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAOP {

    //execution
    @Before("execution(void display())")
    void beforeAdvice() {
        System.out.println("Running before advice");
    }
    @After("execution(void display())")
    void beforeAdviceafter() {
        System.out.println("Running after advice");
    }

    //within

    @Before("within(AOP.Question7.*)")
    void beforeAdvicewithin() {
        System.out.println("Running before advice");
    }

    @After("within(AOP.Question7.*)")
    void beforeAdvicewithinafter() {
        System.out.println("Running after advice");
    }

    //args

    @Before("args(Integer)")
    void beforeAdviceargs() {
        System.out.println("Running before advice");
    }

    @After("args(Integer)")
    void beforeAdviceargsafter() {
        System.out.println("Running after advice");
    }
    //bean

    @Before("bean(Logger))")
    void beforeAdvicebean() {
        System.out.println("Running before advice");
    }

    @After("bean(Logger))")
    void beforeAdvicebeanafter() {
        System.out.println("Running after advice");
    }
    //this

    @Before("this(AOP.Question7.Logger)")
    void beforeAdvicethis() {
        System.out.println("Running before advice");
    }
    @After("this(AOP.Question7.Logger)")
    void beforeAdvicethisafter() {
        System.out.println("Running after advice");
    }
}
