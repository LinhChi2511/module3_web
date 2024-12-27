package com.codegym.mvc.service.impl;

import com.codegym.mvc.entity.Student;
import com.codegym.mvc.repository.StudentRepo;
import com.codegym.mvc.service.IStudentService;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements IStudentService {
    private static StudentRepo studentRepo = new StudentRepo();

    @Override
    public List<Student> getAll() {
        List<Student> students = studentRepo.getAll();
        return students;
    }

    @Override
    public void save(Student student) {
        studentRepo.save(student);

    }

    @Override
    public void remove(int id) {
        studentRepo.deleteById(id);
    }


    @Override
    public void update(int id, Student student) {

    }

    @Override
    public Student findByName(String name) {
        List<Student> students = studentRepo.getAll();
        for (Student student : students) {
            if (student.getName().equals(name)) {
                 return student;
            }
        }
        return null;
    }

    public Student findById(int id) {
        for (Student student : studentRepo.getAll()) {
            if (student.getCode() == id) {
                return student;
            }
        }
        return null;
    }
}
