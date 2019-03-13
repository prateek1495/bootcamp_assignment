package AOP.Question5;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAOP {
    @Before("execution(public void display())")
    public void showbefore() {
        System.out.println("Before display method");
    }

    @After("execution(public void display())")
    public void showafter() {
        System.out.println("After display method");
    }

}
