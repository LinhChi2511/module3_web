package com.example.bt1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "")
public class CustomerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Mai Văn Hoàn", "1983-08-20", "Hà Nội"));
        customers.add(new Customer("Nguyễn Văn Nam", "1983-08-21", "Bắc Giang"));
        customers.add(new Customer("Nguyễn Thái Hòa", "1983-08-22", "Nam Định"));
        customers.add(new Customer("Trần Đăng Khoa", "1983-08-17", "Hà Tây"));
        customers.add(new Customer("Nguyễn Đình Thi", "1983-08-19", "Hà Nội"));

        req.setAttribute("cus", customers);
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
