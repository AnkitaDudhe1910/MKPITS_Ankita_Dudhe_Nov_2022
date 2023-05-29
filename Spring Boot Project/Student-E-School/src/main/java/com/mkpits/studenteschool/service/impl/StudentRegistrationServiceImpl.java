package com.mkpits.studenteschool.service.impl;

import com.mkpits.studenteschool.dto.StudentDto;
import com.mkpits.studenteschool.model.Student;
import com.mkpits.studenteschool.repository.StudentRepo;
import com.mkpits.studenteschool.service.StudentRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentRegistrationServiceImpl implements StudentRegistrationService {
    @Autowired
    private StudentRepo studentRepo;
    @Override
    public StudentDto registerStudent(StudentDto studentDto) {
        Student student = Student.builder()
                .first_name(studentDto.getFirstName())
                .last_name(studentDto.getLastName())
                .email(studentDto.getEmail())
                .mobile(studentDto.getMobile())
                .build();
         Student afterRegi = studentRepo.save(student);
          studentDto.setId(afterRegi.getId());
        return studentDto;
    }
}
