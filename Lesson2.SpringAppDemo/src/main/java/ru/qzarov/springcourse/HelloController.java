package ru.qzarov.springcourse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Qzarov
 */
@Controller
public class HelloController {

    @GetMapping("/hello-world")
    public String sayHello() {
        return "hello_world";
    }
}