package de.no3x.tryspringboottestcontainers.controller;

import de.no3x.tryspringboottestcontainers.TrySpringbootTestcontainersApplication;
import de.no3x.tryspringboottestcontainers.tests.DatabaseTestBase;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.hamcrest.Matchers.is;

@SpringBootTest(classes = TrySpringbootTestcontainersApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class PersonControllerRestAssuredPortTest extends DatabaseTestBase {

    @BeforeAll
    public static void setUp(@LocalServerPort Integer port) {
        RestAssured.port = port;
    }

    @Test
    void whenRequestingPersons_thenReturnPersons() {
        RestAssured.when().get("/persons")
                .then().statusCode(200)
                .and().body("content[0].name", is("John"));
    }

}