package ru.shilaev.tacocloudproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "ru.shilaev")
public class TacoCloudProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(TacoCloudProjectApplication.class, args);
    }

}
