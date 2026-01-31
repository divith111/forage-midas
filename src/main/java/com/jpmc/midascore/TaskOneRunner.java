package com.jpmc.midascore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TaskOneRunner {

    private static final Logger logger = LoggerFactory.getLogger(TaskOneRunner.class);

    @Bean
    CommandLineRunner runTaskOne() {
        return args -> {
            logger.info("Congrats! It looks like your application booted without issue");
            logger.info("--- begin output ---");

            for (int i = 0; i < 10; i++) {
                int value = (int) Math.pow(i, i);
                logger.info(String.valueOf(value));
            }

            logger.info("--- end output ---");
        };
    }
}