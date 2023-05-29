package com.mkpits.studenteschool.repository;

import com.mkpits.studenteschool.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Long> {
}
