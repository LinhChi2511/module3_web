package com.example.bt2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/calculator")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        Double num1 = Double.parseDouble(req.getParameter("firstNum"));
        Double num2 = Double.parseDouble(req.getParameter("secondNum"));
//        char operator = req.getParameter("operator").charAt(0);
        String operation = req.getParameter("operation");

        Double result = Calculator.calculator(num1, num2, operation);


    }
}
