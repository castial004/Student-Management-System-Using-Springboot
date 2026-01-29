package com.lecture02.RestApi.and.database.connection.Lecture02.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@ToString
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@Table(
//        name = "Student",
//        uniqueConstraints = {@UniqueConstraint(name = "some name",columnNames = {"name","birthDate"})},
//        indexes = {@Index(name = "idx_student_email_cgpa",columnList = "email,cgpa")}
//)
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private double cgpa;

    private LocalDate birthDate;
    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;
    private LocalDateTime lastUpdatedAt;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Enumerated(EnumType.STRING)
    private BloodGroup bloodGroup;

    public Student(String name,String email){
        this.name = name;
        this.email = email;
    }
}
