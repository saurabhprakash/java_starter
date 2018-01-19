package hello;

/**
 * Created by saurabh on 20/10/17.
 * File is used for rest api test code
 * Reference: https://spring.io/guides/gs/rest-service/
 */

import java.util.concurrent.atomic.AtomicLong;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/greeting")
public class GreetingController{

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    // Handling /error issue : https://stackoverflow.com/questions/31134333/this-application-has-no-explicit-mapping-for-error

    @GetMapping("")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public Greeting greeting_post(@RequestParam(value="name", defaultValue="Post") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

    @PutMapping("")
    public Greeting greeting_put(@RequestParam(value="name", defaultValue="Put") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }
}