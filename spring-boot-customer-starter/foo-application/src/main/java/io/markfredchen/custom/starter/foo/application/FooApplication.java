package io.markfredchen.custom.starter.foo.application;

import io.markfredchen.custom.starter.service.FooService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author markfredchen
 * @since 2018/10/11
 */
@SpringBootApplication
public class FooApplication {
    public static void main(String[] args) {
        SpringApplication.run(FooApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner(final FooService fooService) {
        return args -> {
            System.out.println(fooService.getFooMessage());
            System.out.println(fooService.getBarMessage());
        };
    }
}

