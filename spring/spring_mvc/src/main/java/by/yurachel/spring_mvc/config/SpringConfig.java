package by.yurachel.spring_mvc.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("by.yurachel.spring_mvc")
@EnableWebMvc
public class SpringConfig {

    private final ApplicationContext context;

    
}
