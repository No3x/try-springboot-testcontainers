package de.no3x.tryspringboottestcontainers.mapper;

import de.no3x.tryspringboottestcontainers.dto.PersonDto;
import de.no3x.tryspringboottestcontainers.entity.Person;

public interface PersonMapper {

    static PersonDto toDto(Person person) {
        return new PersonDto(person.getId(), person.getName(), ProjectMapper.toDto(person.getProjects()));
    }

}
