package de.no3x.tryspringboottestcontainers.gateway;

import de.no3x.tryspringboottestcontainers.dto.PersonDto;

import java.util.List;

public interface PersonGateway {
    List<PersonDto> findAll();
}
