package AOP.Question9;

import org.springframework.stereotype.Component;

@Component
public class Logger {
    public Integer getInteger(Integer a)
    {
        return a;
    }
}
