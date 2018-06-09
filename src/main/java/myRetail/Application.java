package myRetail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        //Note: MyRetailController class is main access point of this application.
        SpringApplication.run(Application.class, args);
    }
}