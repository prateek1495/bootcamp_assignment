package AOP.Question3;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main3 {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        AOP.Question3.CustomPublisher customPublisher=ctx.getBean("custompublisher", CustomPublisher.class);
        customPublisher.display();

    }
}
