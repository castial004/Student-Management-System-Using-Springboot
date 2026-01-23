package com.lecture02.RestApi.and.database.connection.Lecture02.Contollers;

import com.lecture02.RestApi.and.database.connection.Lecture02.Dto.StudentDto;
import com.lecture02.RestApi.and.database.connection.Lecture02.Entity.Student;
import com.lecture02.RestApi.and.database.connection.Lecture02.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentRepo studentRepo;

    @GetMapping("/student")
    public List<Student> getStudentById(){
        return studentRepo.findAll();
    }
}
