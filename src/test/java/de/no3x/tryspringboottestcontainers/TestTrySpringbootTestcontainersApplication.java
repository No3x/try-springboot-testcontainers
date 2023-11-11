package de.no3x.tryspringboottestcontainers;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Import;

@Import(TestConfig.class)
public class TestTrySpringbootTestcontainersApplication {

    public static void main(String[] args) {
        SpringApplication.from(TrySpringbootTestcontainersApplication::main).with(TestTrySpringbootTestcontainersApplication.class).run(args);
    }

}
