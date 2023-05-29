package com.mkpits.studenteschool.service.impl;

import com.mkpits.studenteschool.dto.StudentDto;
import com.mkpits.studenteschool.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public List<StudentDto> getAllStudent() {
        List<StudentDto> studentDtoList = new ArrayList<>();
        StudentDto studentDto1 = StudentDto.builder()
                .firstName("Ankita")
                .lastName("Dudhe")
                .email("ankita.dudhe@gmail.com")
                .mobile("8523698512")
                .build();
        StudentDto studentDto2 = StudentDto.builder()
                .firstName("Ishita")
                .lastName("Jumde")
                .email("ishita.jumde@gmail.com")
                .mobile("8963524178")
                .build();
        StudentDto studentDto3 = StudentDto.builder()
                .firstName("Pavan")
                .lastName("Mohankar")
                .email("pavan.mohankar@gmail.com")
                .mobile("8874569823")
                .build();
        StudentDto studentDto4 = StudentDto.builder()
                .firstName("Pranay")
                .lastName("Jumde")
                .email("pranay.jumde@gmail.com")
                .mobile("9956238412")
                .build();
        StudentDto studentDto5 = StudentDto.builder()
                .firstName("Komal")
                .lastName("Bhoyar")
                .email("komal.bhoyar@gmail.com")
                .mobile("7852364123")
                .build();

        studentDtoList.add(studentDto1);
        studentDtoList.add(studentDto2);
        studentDtoList.add(studentDto3);
        studentDtoList.add(studentDto4);
        studentDtoList.add(studentDto5);

        return studentDtoList;
    }
}
