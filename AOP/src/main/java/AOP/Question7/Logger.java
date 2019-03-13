package AOP.Question7;

import org.springframework.stereotype.Component;

@Component
public class Logger {
    public void display()
    {
        System.out.println("This is the display method");
    }
    public void show(Integer a)
    {
        System.out.println("Value is "+a);
    }

}
