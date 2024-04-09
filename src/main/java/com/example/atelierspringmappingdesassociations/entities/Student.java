package com.example.atelierspringmappingdesassociations.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String matricule;
    @ManyToMany(mappedBy = "students", fetch = FetchType.EAGER)
    private Collection<Session> sessions = new ArrayList<>();
}