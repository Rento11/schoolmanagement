package com.example.atelierspringmappingdesassociations.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date date;
    private LocalTime h_debut;
    private LocalTime h_fin;
    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Student> students = new ArrayList<>();
    @ManyToOne
    private Course course;
}
