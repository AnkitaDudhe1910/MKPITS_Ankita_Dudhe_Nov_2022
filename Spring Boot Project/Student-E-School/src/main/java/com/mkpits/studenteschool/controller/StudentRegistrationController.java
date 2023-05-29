package com.mkpits.studenteschool.controller;

import com.mkpits.studenteschool.dto.StudentDto;
import com.mkpits.studenteschool.service.StudentRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentRegistrationController {
    @Autowired
    public StudentRegistrationService studentRegistrationService;
    @PostMapping("/register-student")
      public String regStudent(@ModelAttribute("student")StudentDto studentDto){
        studentRegistrationService.registerStudent(studentDto);
        return "redirect:/studentDetails";
    }
}
