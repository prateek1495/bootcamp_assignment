package AOP.Question3;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CustomPublisher implements ApplicationEventPublisherAware {
    ApplicationEventPublisher applicationEventPublisher;
    void display()
    {
        CustomEvent customEvent=new CustomEvent(this);
        applicationEventPublisher.publishEvent(customEvent);
        System.out.println("hello its publisher");
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher=applicationEventPublisher;
    }
}
