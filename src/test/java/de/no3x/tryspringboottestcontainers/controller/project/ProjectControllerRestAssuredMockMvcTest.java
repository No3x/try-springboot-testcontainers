package de.no3x.tryspringboottestcontainers.controller.project;

import de.no3x.tryspringboottestcontainers.tests.DatabaseTestBase;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.context.WebApplicationContext;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.when;
import static org.hamcrest.Matchers.*;

@SpringBootTest
class ProjectControllerRestAssuredMockMvcTest extends DatabaseTestBase {

    @Autowired
    private WebApplicationContext context;

    @BeforeEach
    void setup() {
        RestAssuredMockMvc.webAppContextSetup(context);
    }

    @Test
    void whenRequestingProjects_thenReturnPersons() {
        when().get("/projects")
                .then().statusCode(200)
                .and().body("content", hasSize(1))
                .and().body("content[0].name", is("projectA"));
    }

    @Test
    void whenRequestingProjectPersons_thenReturnPersons() {
        when().get("/projects/1/persons")
                .then().statusCode(200)
                .and().body("content", hasSize(2));
    }
}
