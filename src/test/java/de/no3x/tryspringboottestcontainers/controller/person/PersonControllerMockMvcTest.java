package de.no3x.tryspringboottestcontainers.controller.person;

import de.no3x.tryspringboottestcontainers.TrySpringbootTestcontainersApplication;
import de.no3x.tryspringboottestcontainers.tests.DatabaseTestBase;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(classes = TrySpringbootTestcontainersApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class PersonControllerMockMvcTest extends DatabaseTestBase {

    @Autowired
    private MockMvc mvc;

    @Test
    void whenRequestingPersons_thenReturnPersons() throws Exception {
         mvc.perform(get("/persons"))
                 .andExpect(status().isOk())
                 .andExpect(jsonPath("content[0].name").value("John"));
    }

}
