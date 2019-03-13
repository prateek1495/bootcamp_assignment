package AOP.Question8;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAOP {

    //Reuse the Pointcut
    @Before("displayPointcut() || showNamePointcut()")
    void beforeAdvice() {
        System.out.println("Running before advice");
    }

    //Reuse the Pointcut
    @After("displayPointcut()")
    void afterAdvice(){
        System.out.println("Running after advice");
    }

    //Defining Pointcut
    @Pointcut("execution(void display())")
    void displayPointcut(){}

    //Defining Pointcut

    @Pointcut("execution(String showName())")
    void showNamePointcut(){}
}
