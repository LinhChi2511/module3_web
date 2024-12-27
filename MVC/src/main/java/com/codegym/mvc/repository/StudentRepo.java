package com.codegym.mvc.repository;

import com.codegym.mvc.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepo {
    private static List<Student> students = new ArrayList<Student>();

    static {
        students.add(new Student(1, "Min", "DH", 10, "C0724M1"));
        students.add(new Student(5, "Ha", "DN", 9, "C0724M2"));
        students.add(new Student(4, "Hieu", "Quang Tri", 8, "C0724M1"));
    }

    public List<Student> getAll() {
        return students;
    }

    public void save(Student s) {
        students.add(s);
    }

    public void deleteById(int id) {
        List<Student> students1 = getAll();
        for (Student s : students1) {
            if (s.getCode() == id){
                students.remove(s);
                break;
            }
        }
    }
}