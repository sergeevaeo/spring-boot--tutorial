package com.example.springboottutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController //помечает класс как обработчик запроса
public class SpringBootTutorialApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTutorialApplication.class, args);
    }

    @GetMapping("/hello") // сопоставляет /hello и запрос GET
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) { // name map myName
        return String.format("Hello %s!", name);
    }

}
