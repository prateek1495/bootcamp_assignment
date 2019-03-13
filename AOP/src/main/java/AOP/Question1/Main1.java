package AOP.Question1;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.security.auth.login.Configuration;

public class Main1 {
    public static void main(String[] args) {

        ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("spring-config.xml");
       //start event
        ctx.start();
        //refresh event
        ctx.refresh();
        ContextEventExample contextEventExample=ctx.getBean("contextevent",ContextEventExample.class);
        contextEventExample.display();
        //stop event
        ctx.stop();
        //close event
        ctx.close();

    }
}
