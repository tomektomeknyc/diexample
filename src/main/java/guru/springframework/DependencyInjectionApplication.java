package guru.springframework;

import guru.springframework.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args)
	{
		//SpringApplication.run(DependencyInjectionApplication.class, args);

		ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);

		GreetingController controller = (GreetingController) ctx.getBean("greetingController");

		controller.sayHello();

	}
}
