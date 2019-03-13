package AOP.Question4;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAOP {
    @Before("@target(org.springframework.stereotype.Service)")
    void beforeAdvice()
    {
        System.out.println("Before advice is running");
    }

}
