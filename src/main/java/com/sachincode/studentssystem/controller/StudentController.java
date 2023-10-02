package com.sachincode.studentssystem.controller;

import com.sachincode.studentssystem.model.Student;
import com.sachincode.studentssystem.service.StudentService;
import com.sachincode.studentssystem.constants.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping(value= Constants.S_PATH)
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
        studentService.saveStudent(student);
        return "new student added";
    }

    @GetMapping("/getAll")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
}
