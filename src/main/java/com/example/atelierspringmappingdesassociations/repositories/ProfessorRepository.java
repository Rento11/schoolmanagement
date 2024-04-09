package com.example.atelierspringmappingdesassociations.repositories;

import com.example.atelierspringmappingdesassociations.entities.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Integer> {
}
