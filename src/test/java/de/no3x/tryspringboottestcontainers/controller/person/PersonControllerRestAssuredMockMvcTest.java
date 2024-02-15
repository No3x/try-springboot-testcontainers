package de.no3x.tryspringboottestcontainers.controller.person;

import de.no3x.tryspringboottestcontainers.tests.DatabaseTestBase;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.context.WebApplicationContext;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.when;
import static org.hamcrest.Matchers.is;

@SpringBootTest
class PersonControllerRestAssuredMockMvcTest extends DatabaseTestBase {

    @Autowired
    private WebApplicationContext context;

    @BeforeEach
    void setup() {
        RestAssuredMockMvc.webAppContextSetup(context);
    }

    @Test
    void whenRequestingPersons_thenReturnPersons() {
        when().get("/persons")
                .then().statusCode(200)
                .and().body("content[0].name", is("John"));
    }
}
