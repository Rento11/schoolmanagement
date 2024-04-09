package com.example.atelierspringmappingdesassociations.repositories;

import com.example.atelierspringmappingdesassociations.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}
