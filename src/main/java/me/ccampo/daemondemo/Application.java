package me.ccampo.daemondemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @RestController
    public static class HelloController {

        @RequestMapping
        public String helloWorld() {
<<<<<<< HEAD
            return "Hotelbeds Group says Hello World!";
=======
            return "Hello Hotelbeds Group world!";
>>>>>>> 817d5b6e70540103bca06833ca75292d7f01a625
        }
    }
}
