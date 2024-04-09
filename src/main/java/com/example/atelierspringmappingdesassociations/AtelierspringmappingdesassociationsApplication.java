package com.example.atelierspringmappingdesassociations;

import com.example.atelierspringmappingdesassociations.entities.Course;
import com.example.atelierspringmappingdesassociations.entities.Professor;
import com.example.atelierspringmappingdesassociations.entities.Session;
import com.example.atelierspringmappingdesassociations.entities.Student;
import com.example.atelierspringmappingdesassociations.repositories.CourseRepository;
import com.example.atelierspringmappingdesassociations.repositories.ProfessorRepository;
import com.example.atelierspringmappingdesassociations.repositories.SessionRepository;
import com.example.atelierspringmappingdesassociations.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class AtelierspringmappingdesassociationsApplication implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private SessionRepository sessionRepository;
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private ProfessorRepository professorRepository;

    public static void main(String[] args) {
        SpringApplication.run(AtelierspringmappingdesassociationsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Professor professor1 = new Professor(1, "Hirchoua", new Date(), null);
        Professor professor2 = new Professor(2, "Nouh", new Date(), null);
        Professor professor3 = new Professor(3, "Mariam", new Date(), null);
        Professor professor4 = new Professor(4, "Banane", new Date(), null);
        professorRepository.save(professor1);
        professorRepository.save(professor2);
        professorRepository.save(professor3);
        professorRepository.save(professor4);
        //-----------------------------------------
        Course course1 = new Course(1, "JEE", "Java entreprise edition course", null, null);
        Course course2 = new Course(2, "GL", "Genie Logiciel course", null, null);
        Course course3 = new Course(3, "DEVOPS", "DEVOPS course", null, null);
        Course course4 = new Course(4, "Android", "Android course", null, null);
        courseRepository.save(course1);
        courseRepository.save(course2);
        courseRepository.save(course3);
        courseRepository.save(course4);
        //-----------------------------------------
        Student student1 = new Student(1, "MOUCHRIF", "MOUCHRIF2023", null);
        Student student2 = new Student(2, "KAMOUSS", "KAMOUSS2023", null);
        Student student3 = new Student(3, "ENNIOUAR", "ENNIOUAR2023", null);
        Student student4 = new Student(4, "SAIDI", "SAIDI2023", null);

        List<Student> studentsL1 = new ArrayList<>();
        studentsL1.add(student1);
        studentsL1.add(student2);
        studentRepository.saveAll(studentsL1);

        List<Student> studentsL2 = new ArrayList<>();
        studentsL2.add(student3);
        studentsL2.add(student4);
        studentRepository.saveAll(studentsL2);
        //-----------------------------------------
        Session session1 = new Session(1, new Date(), LocalTime.of(8, 0), LocalTime.of(10, 0), null, null);
        Session session2 = new Session(2, new Date(), LocalTime.of(10, 1), LocalTime.of(12, 0), null, null);
        Session session3 = new Session(3, new Date(), LocalTime.of(14, 0), LocalTime.of(16, 0), null, null);
        Session session4 = new Session(4, new Date(), LocalTime.of(16, 1), LocalTime.of(18, 0), null, null);
        List<Session> sessionsL1 = new ArrayList<>();
        sessionsL1.add(session1);
        sessionsL1.add(session2);
        sessionRepository.saveAll(sessionsL1);
        List<Session> sessionsL2 = new ArrayList<>();
        sessionsL2.add(session3);
        sessionsL2.add(session4);
        sessionRepository.saveAll(sessionsL2);
        //-----------------------------------------
        professor1.setCourse(course1);
        professor2.setCourse(course2);
        professor3.setCourse(course3);
        professor4.setCourse(course4);
        //-----------------------------------------
        course1.setProfessor(professor1);
        course2.setProfessor(professor2);
        course3.setProfessor(professor3);
        course4.setProfessor(professor4);
        //-----------------------------------------
        session1.setStudents(studentsL1);
        session2.setStudents(studentsL1);
        session3.setStudents(studentsL2);
        session4.setStudents(studentsL2);
        //-----------------------------------------
        student1.setSessions(sessionsL1);
        student2.setSessions(sessionsL1);
        student3.setSessions(sessionsL2);
        student4.setSessions(sessionsL2);

        professorRepository.save(professor1);
        professorRepository.save(professor2);
        professorRepository.save(professor3);
        professorRepository.save(professor4);

        courseRepository.save(course1);
        courseRepository.save(course2);
        courseRepository.save(course3);
        courseRepository.save(course4);

        studentRepository.saveAll(studentsL1);

        studentRepository.saveAll(studentsL2);

        sessionRepository.saveAll(sessionsL1);

        sessionRepository.saveAll(sessionsL2);

//        application.properties:
//        server.port=8090
//        spring.datasource.url=jdbc:h2:mem:ecole
//        spring.h2.console.enabled=true
    }
}