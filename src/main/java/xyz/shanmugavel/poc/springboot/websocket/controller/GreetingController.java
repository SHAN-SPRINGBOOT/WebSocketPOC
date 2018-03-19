package xyz.shanmugavel.poc.springboot.websocket.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import xyz.shanmugavel.poc.springboot.websocket.model.Greeting;
import xyz.shanmugavel.poc.springboot.websocket.model.HelloMessage;

@Controller
public class GreetingController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting sayHello(HelloMessage msg) throws Exception {
        Thread.sleep(1000);
        return new Greeting("Hi " + msg.getName() + "!");
    }
}
