package com.example.atelierspringmappingdesassociations.repositories;

import com.example.atelierspringmappingdesassociations.entities.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Integer> {
}
