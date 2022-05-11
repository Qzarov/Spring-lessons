package ru.qzarov.springcourse;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Qzarov
 */
@Configuration
@ComponentScan("ru.qzarov.springcourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    
}
