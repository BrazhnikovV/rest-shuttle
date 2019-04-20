package ru.brazhnikov.shuttle.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.context.annotation.Configuration;
import ru.brazhnikov.shuttle.entity.repository.RoverRepository;

/**
 * @version 1.0.1
 * @author Vasily Brazhnikov
 */
@Configuration
@Slf4j
public class AppConfiguration {

    @Bean
    public CommandLineRunner getLoadService(RoverRepository roverRepository) {
        return args -> {
            log.info("Start load data");
            log.info("Data = {}");
            log.info("Data = {}");
            log.info("Data = {}");
            log.info("Data has loaded");
        };
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
