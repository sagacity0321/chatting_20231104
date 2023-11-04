package com.ll.chatting_20231104;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Chatting20231104Application {

    public static void main(String[] args) {
        SpringApplication.run(Chatting20231104Application.class, args);
    }

}
