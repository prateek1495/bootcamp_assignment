package AOP.Question5;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;


@Component
public class Logger {
    public void display()
    {
        System.out.println("This is the display method");
    }
}
