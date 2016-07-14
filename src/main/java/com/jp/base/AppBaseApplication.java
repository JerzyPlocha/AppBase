package com.jp.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class AppBaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppBaseApplication.class, args);
    }
}
