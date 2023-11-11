package de.no3x.tryspringboottestcontainers.tests;


import de.no3x.tryspringboottestcontainers.TestConfig;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.context.annotation.Import;


@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Import(TestConfig.class)
public abstract class DatabaseTestBase {
}
