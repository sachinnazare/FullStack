package com.sachincode.studentssystem.service;

import com.sachincode.studentssystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);

    public List<Student> getAllStudents();
}
