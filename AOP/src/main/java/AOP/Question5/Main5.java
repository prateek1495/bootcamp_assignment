package AOP.Question5;

import AOP.Question4.Config;
import AOP.Question4.Services;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


public class Main5 {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx=new AnnotationConfigApplicationContext("AOP.Question5");
        Logger logger=ctx.getBean(Logger.class);
        logger.display();
    }
}
