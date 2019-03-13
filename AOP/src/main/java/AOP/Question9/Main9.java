package AOP.Question9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main9 {
    public static void main(String[] args) {
        ApplicationContext ctx=new AnnotationConfigApplicationContext("AOP.Question9");
        Logger logger=ctx.getBean(Logger.class);
        Integer a=logger.getInteger(10);
        System.out.println(a);
    }
}
