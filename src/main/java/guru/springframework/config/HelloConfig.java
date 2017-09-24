package guru.springframework.config;


import guru.springframework.services.HelloWorldServiceEnglishImpl;
import guru.springframework.services.HelloWorldService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfig {
@Bean
public HelloWorldService helloWorldServiceEnglish(){

    return new HelloWorldServiceEnglishImpl();
}
}
