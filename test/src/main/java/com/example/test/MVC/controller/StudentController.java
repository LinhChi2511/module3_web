package com.example.test.MVC.controller;

import com.example.test.MVC.entity.Student;
import com.example.test.MVC.service.IStudentService;
import com.example.test.MVC.service.impl.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "studentController", urlPatterns = "/students")
public class StudentController extends HttpServlet {
    private IStudentService studentService = new StudentService();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                String name = req.getParameter("name");
                String address = req.getParameter("address");
                double point = Double.parseDouble(req.getParameter("point"));
                String className = req.getParameter("className");
                Student student = new Student(name, address, point, className);
                studentService.save(student);
                resp.sendRedirect("/students");
                break;
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String action = req.getParameter("action");
        if(action == null) {
            action = "";
        }
        switch (action){
            case "create":
                req.getRequestDispatcher("/WEB-INF/view/create.jsp").forward(req, resp);
                break;
            case "delete":
                break;
            default:
                List<Student> students = studentService.getAll();
                req.setAttribute("students", students);
                req.getRequestDispatcher("/WEB-INF/view/list.jsp").forward(req, resp);
                break;

        }

    }
}
