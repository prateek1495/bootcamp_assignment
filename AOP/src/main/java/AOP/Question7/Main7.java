package AOP.Question7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main7 {
    public static void main(String[] args) {
        ApplicationContext ctx=new AnnotationConfigApplicationContext("AOP.Question7");
        Logger logger=ctx.getBean(Logger.class);
        logger.display();
        logger.show(10);
    }
}
