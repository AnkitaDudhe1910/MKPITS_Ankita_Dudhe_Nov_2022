package com.mkpits.studenteschool.service.impl;

import com.mkpits.studenteschool.dto.StudentDto;
import com.mkpits.studenteschool.model.Student;
import com.mkpits.studenteschool.repository.StudentRepo;
import com.mkpits.studenteschool.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@Primary
public class StudentRegiServiceImpl implements StudentService {
    @Autowired
    private StudentRepo studentRepo;
    @Override
    public List<StudentDto> getAllStudent() {
        List<StudentDto> studentDtoList = new ArrayList<>();
        List<Student> studentList = studentRepo.findAll();
        studentList.stream().forEach(student -> {
            StudentDto studentDto = StudentDto.builder()
                    .firstName(student.getFirst_name())
                    .lastName(student.getLast_name())
                    .email(student.getEmail())
                    .mobile(student.getMobile())
                    .build();
            studentDtoList.add(studentDto);
        });
        return studentDtoList;
    }
}
