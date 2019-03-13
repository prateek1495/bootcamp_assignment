package AOP.Question2;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class MyEventListener implements ApplicationListener {

        @Override
        public void onApplicationEvent(ApplicationEvent event) {
            System.out.println("This is application listener");
            System.out.println(event);
        }
    }

