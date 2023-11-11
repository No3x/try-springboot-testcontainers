package de.no3x.tryspringboottestcontainers.repository;

import de.no3x.tryspringboottestcontainers.entity.Person;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PersonRepository extends ListCrudRepository<Person, Long> {
}
