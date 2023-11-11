package de.no3x.tryspringboottestcontainers;

import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.TestPropertySource;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.utility.DockerImageName;

@ImportAutoConfiguration(TrySpringbootTestcontainersApplication.class)
@TestConfiguration(proxyBeanMethods = false)
@TestPropertySource({"classpath:application.properties", "classpath:application-test.properties"})
public class TestConfig {

    @Bean
    @ServiceConnection
    PostgreSQLContainer<?> postgresContainer() {
        return new PostgreSQLContainer<>(DockerImageName.parse("postgres:16.0-alpine")).withReuse(true);
    }

}
