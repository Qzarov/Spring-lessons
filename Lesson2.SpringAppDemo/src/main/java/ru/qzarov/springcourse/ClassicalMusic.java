package ru.qzarov.springcourse;

import org.springframework.stereotype.Component;

/**
 * @author Qzarov
 */
@Component("someClassicalMusic")
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Tchaikovskiy - Swan's Lake";
    }
}
