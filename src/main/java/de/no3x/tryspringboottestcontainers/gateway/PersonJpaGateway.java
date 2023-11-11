package de.no3x.tryspringboottestcontainers.gateway;

import de.no3x.tryspringboottestcontainers.dto.PersonDto;
import de.no3x.tryspringboottestcontainers.mapper.PersonMapper;
import de.no3x.tryspringboottestcontainers.repository.PersonRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonJpaGateway implements PersonGateway {

    private final PersonRepository personRepository;

    public PersonJpaGateway(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<PersonDto> findAll() {
        return personRepository.findAll().stream().map(PersonMapper::toDto).toList();
    }

}
