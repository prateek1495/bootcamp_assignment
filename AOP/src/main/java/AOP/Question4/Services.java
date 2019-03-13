package AOP.Question4;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Services {
    public void startService()
    {
        System.out.println("Start Service");
    }
    public void stopService()
    {
        System.out.println("Stop Service");
    }
    public void runService()
    {
        System.out.println("Run Service");
    }
}
