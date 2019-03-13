package AOP.Question2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        MyEventListener myEventListener=ctx.getBean("myeventlistener",MyEventListener.class);
        myEventListener.onApplicationEvent(new ContextRefreshedEvent(ctx));
        ctx.stop();

    }
}
