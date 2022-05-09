package ru.qzarov.springcourse;

import org.springframework.stereotype.Component;

/**
 * @author Qzarov
 */
@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Sabaton - Defence of Moscow";
    }
}
