package com.lecture02.RestApi.and.database.connection.Lecture02.Repository;

import com.lecture02.RestApi.and.database.connection.Lecture02.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Long> {

}
