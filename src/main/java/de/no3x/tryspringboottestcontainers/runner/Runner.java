package de.no3x.tryspringboottestcontainers.runner;

import de.no3x.tryspringboottestcontainers.gateway.PersonGateway;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Runner implements ApplicationRunner {

    private final PersonGateway personGateway;

    Runner(PersonGateway personGateway) {
        this.personGateway = personGateway;
    }

    @Override
    public void run(ApplicationArguments args) {
        log.info("Persons {}", personGateway.findAll());
    }
}
