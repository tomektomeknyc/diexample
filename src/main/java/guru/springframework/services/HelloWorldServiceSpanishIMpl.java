package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"default", "spanish"})
public class HelloWorldServiceSpanishIMpl implements HelloWorldService{
    @Override
    public String getGreeting() {
        return "Hola mundo!!!";
    }
}

