package de.no3x.tryspringboottestcontainers.dto;

import java.util.List;

public record PersonDto(Long id, String name, List<ProjectDto> projects) {
}
