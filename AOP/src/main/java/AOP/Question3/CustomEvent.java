package AOP.Question3;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {
    CustomEvent(Object obj) {
        super(obj);
    }
}
