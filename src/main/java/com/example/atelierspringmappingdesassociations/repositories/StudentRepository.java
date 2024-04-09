package com.example.atelierspringmappingdesassociations.repositories;

import com.example.atelierspringmappingdesassociations.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
