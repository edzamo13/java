package ec.com.example.reactiveWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RectiveWebApplication {

    public static void main(String[] args) {

		SpringApplication.run(RectiveWebApplication.class, args);

        ConfigurableApplicationContext context = SpringApplication.run(RectiveWebApplication.class, args);
        GreetingClient client = context.getBean(GreetingClient.class);
        // We need to block for the content here or the JVM might exit before the message is logged
        System.out.println( "--message =>" + client.getMessage().block());


		/*ConfigurableApplicationContext context = SpringApplication.run(RectiveWebApplication.class, args);
		GreetingClient greetingClient = context.getBean(GreetingClient.class);
		// We need to block for the content here or the JVM might exit before the message is logged
		System.out.println(">> message = " + greetingClient.getMessage().block());*/
    }

}
