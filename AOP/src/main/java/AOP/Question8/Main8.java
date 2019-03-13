package AOP.Question8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main8 {
    public static void main(String[] args) {
        ApplicationContext ctx=new AnnotationConfigApplicationContext("AOP.Question8");
        Logger logger=ctx.getBean(Logger.class);
        logger.display();
        logger.showName();

    }
}
