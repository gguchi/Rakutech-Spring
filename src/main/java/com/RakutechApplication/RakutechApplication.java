package com.RakutechApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RakutechApplication {

    public static void main(String[] args) {

        SpringApplication.run(RakutechApplication.class, args);
    }

    @GetMapping("/Rakutech")
    public String hello(@RequestParam(value = "name", defaultValue = "Rakutech") String name) {
        return String.format("Hello %s!", name);
    }

}

