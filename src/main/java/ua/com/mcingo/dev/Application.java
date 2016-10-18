package ua.com.mcingo.dev;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by it_mb on 18.10.2016.
 */
@RestController
@EnableAutoConfiguration
@ComponentScan("ua.com.mcingo.dev")
public class Application {
}
