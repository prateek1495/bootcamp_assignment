package AOP.Question6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main6 {
    public static void main(String[] args) {
        ApplicationContext ctx=new AnnotationConfigApplicationContext("AOP.Question6");
        Logger logger=ctx.getBean(Logger.class);
        logger.methodThrowException();

    }

}
