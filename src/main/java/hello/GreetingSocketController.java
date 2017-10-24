package hello;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingSocketController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public GreetingSocket greeting(HelloMessage message) throws Exception {
        Thread.sleep(1000); // simulated delay
        return new GreetingSocket("Hello, " + message.getName() + "!");
    }
}