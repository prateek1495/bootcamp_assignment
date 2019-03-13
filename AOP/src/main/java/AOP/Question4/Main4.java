package AOP.Question4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main4 {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx=new AnnotationConfigApplicationContext(Config.class);
        Services services=ctx.getBean(Services.class);
        services.runService();
        services.startService();
        services.stopService();
    }
}
