package com.example.test.MVC.service.impl;

import com.example.test.MVC.entity.Student;
import com.example.test.MVC.repository.StudentRepository;
import com.example.test.MVC.service.IStudentService;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements IStudentService {
    StudentRepository studentRepository = new StudentRepository();

    @Override
    public List<Student> getAll() {
        List<Student> students = studentRepository.getAll();
        return students;
    }

    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void delete(int id) {
        studentRepository.delete(id);
    }

    @Override
    public Student findById(int id) {
        return studentRepository.findByID(id);
    }
}
