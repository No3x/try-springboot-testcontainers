package de.no3x.tryspringboottestcontainers.mapper;

import de.no3x.tryspringboottestcontainers.dto.ProjectDto;
import de.no3x.tryspringboottestcontainers.entity.Project;

import java.util.List;
import java.util.Set;

public interface ProjectMapper {

    static ProjectDto toDto(Project project) {
        return new ProjectDto(project.getId(), project.getName());
    }

    static List<ProjectDto> toDto(Set<Project> projects) {
        return projects.stream().map(ProjectMapper::toDto).toList();
    }
}
