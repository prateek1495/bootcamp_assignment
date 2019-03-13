package AOP.Question6;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Logger {
    public void methodThrowException()
    {
        System.out.println("Inside the method which throws exception");
        throw new ArithmeticException();
    }
    public void methodThrowException1()
    {
        System.out.println("Inside the method which throws exception");
        throw new ArithmeticException();
    }
}
