package com.lecture02.RestApi.and.database.connection.Lecture02.Repository;

import com.lecture02.RestApi.and.database.connection.Lecture02.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Long> {

}
