package hello;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.cache.annotation.EnableCaching;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableCaching
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);    

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

    // @Bean
    // public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
    //     return args -> {

    //         Quote quote = restTemplate.getForObject(
    //             "http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
    //         log.info(quote.toString());

    //         System.out.println("Let's inspect the beans provided by Spring Boot:");

    //         String[] beanNames = ctx.getBeanDefinitionNames();
    //         Arrays.sort(beanNames);
    //         for (String beanName : beanNames) {
    //             System.out.println(beanName);
    //         }

    //     };
    // }


    @Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			Quote quote = restTemplate.getForObject(
					"http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
			log.info(quote.toString());
		};
	}

}