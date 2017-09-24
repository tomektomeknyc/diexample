package guru.springframework.services;


import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
@Primary
@Component
@Profile({"default", "english"})
public class HelloWorldServiceEnglishImpl implements HelloWorldService{

    @Override
    public String getGreeting() {
        return "Hello World!";
    }
}
