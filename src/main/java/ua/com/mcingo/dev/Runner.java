package ua.com.mcingo.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by it_mb on 18.10.2016.
 */
@SpringBootApplication

public class Runner {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
