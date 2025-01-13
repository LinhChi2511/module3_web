package com.example.test.MVC.repository;

import com.example.test.MVC.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    private static List<Student> students = new ArrayList<>();
    static {
        students.add(new Student(1,"Min","Da Nang",9.0,"C0724"));
        students.add(new Student(7,"Ha","Quang Nam",8,"C0724"));
        students.add(new Student(3,"Alex","Ha Noi",9.0,"C0724"));
        students.add(new Student(6,"Lyn","Da Nang",10.0,"C0724"));
    }

    public List<Student> getAll() {
        return students;
    }

    public void save(Student s){
        students.add(s);
    }

    public void delete(int id){
        List<Student> students = getAll();
        for(Student s:students){
            if(s.getId()==id){
                students.remove(s);
                break;
            }
        }
    }

    public Student findByID(int id){
        List<Student> students = getAll();
        for(Student s:students){
            if(s.getId()==id){
                return s;
            }
        }
        return null;
    }
}
