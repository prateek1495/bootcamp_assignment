package AOP.Question8;

import org.springframework.stereotype.Component;

@Component
public class Logger {
    public void display()
    {
        System.out.println("This is the display method");
    }
    public void showName()
    {
        System.out.println("This is the showName method");
    }

}
