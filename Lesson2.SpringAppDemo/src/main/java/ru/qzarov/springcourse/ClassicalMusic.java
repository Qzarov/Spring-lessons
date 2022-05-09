package ru.qzarov.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Qzarov
 */
@Component
@Scope("singleton")
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Tchaikovskiy - Swan's Lake";
    }
}
