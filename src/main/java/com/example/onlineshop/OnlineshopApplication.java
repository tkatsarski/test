package com.example.onlineshop;

import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class OnlineshopApplication {
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(OnlineshopApplication.class, args);
	}


@Component
public class TestRunner implements CommandLineRunner {
	@Autowired
private Environment environment;


    @Override
    public void run(String... strings) throws Exception {
        System.out.println(environment.getProperty("PROJECT_NAME"));
    }
}
}
