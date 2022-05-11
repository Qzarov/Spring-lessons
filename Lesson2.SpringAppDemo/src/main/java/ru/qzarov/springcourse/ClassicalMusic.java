package ru.qzarov.springcourse;

//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


/**
 * @author Qzarov
 */
@Component
//@Scope("prototype")
public class ClassicalMusic implements Music {

    @PostConstruct
    public void doInit() {
        System.out.println("Initialization: ClassicalMusic");
    } 

    @PreDestroy
    public void doDestroy() {
        System.out.println("Destruction: ClassicalMusic");
    } 

    @Override
    public String getSong() {
        return "Tchaikovskiy - Swan's Lake";
    }
}
