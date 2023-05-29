package com.mkpits.studenteschool.controller;

import com.mkpits.studenteschool.dto.StudentDto;
import com.mkpits.studenteschool.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    public StudentService studentService;
    @GetMapping("/")
    public String homePage(Model model){

        return "index";
    }

    @GetMapping("/studentDetails")
    public String getStudentDetails(Model model){
      List<StudentDto> studentDtos = studentService.getAllStudent();
//      model.addAttribute("studentDetails",studentDtos);
        model.addAttribute("students",studentDtos);
        return "student";
    }
    @GetMapping("/register-student-form")
    public String registerStudent(Model model){
     StudentDto studentDto = new StudentDto();
     model.addAttribute("student",studentDto);
        return "register-student";
    }
}
