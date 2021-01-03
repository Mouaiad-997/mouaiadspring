package com.mouaiadspring.mouaiadspring;

import com.mouaiadspring.mouaiadspring.service.ScraperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import javax.swing.*;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	private ScraperService scraperService;
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

	@Override
	public void run(String... args) throws Exception {
    scraperService.fetchData("https://aliqtisadi.com/");
    }
}
