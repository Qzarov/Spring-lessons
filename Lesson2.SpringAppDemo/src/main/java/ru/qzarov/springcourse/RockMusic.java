package ru.qzarov.springcourse;

import org.springframework.stereotype.Component;

/**
 * @author Qzarov
 */
@Component("someRockMusic")
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Sabaton - Defence of Moscow";
    }
}
