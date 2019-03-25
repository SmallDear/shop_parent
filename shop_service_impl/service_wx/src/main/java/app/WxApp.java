package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "service")
@EnableEurekaClient
public class WxApp {

    public static void main(String[] args) {
        SpringApplication.run(WxApp.class, args);
    }

}
