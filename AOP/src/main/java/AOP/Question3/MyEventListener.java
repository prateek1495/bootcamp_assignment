package AOP.Question3;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventListener implements ApplicationListener<CustomEvent> {

        @Override
        public void onApplicationEvent(CustomEvent event) {
            System.out.println("hello");
            System.out.println(event.getSource());
        }

}
