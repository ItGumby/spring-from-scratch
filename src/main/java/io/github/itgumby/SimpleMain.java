package io.github.itgumby;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

@SpringBootApplication
public class SimpleMain {
    public static void main(String[] args) {
        System.out.println("starting @SpringBootApplication SimpleMain");
        SpringApplication.run(SimpleMain.class, args);
    }
}
