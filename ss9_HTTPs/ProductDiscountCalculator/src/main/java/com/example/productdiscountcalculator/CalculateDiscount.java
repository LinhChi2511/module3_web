package com.example.productdiscountcalculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculateDiscount", urlPatterns = "/calculator")
public class CalculateDiscount extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String product = request.getParameter("Description");
        double price = Double.parseDouble(request.getParameter("Price"));
        double discount = Double.parseDouble(request.getParameter("DiscountPercent"));

        double discountAmount = price * discount * 0.01;
        double priceAfter = price - discountAmount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1> Product Discount Calculator</h1>");
        writer.println("<p> Product Description: " + product + "</p>");
        writer.println("<p> List Price: " + price + "</p>");
        writer.println("<p> Discount Percent: " + discount + "%</p>");
        writer.println("<p> Discount Amount: " + discountAmount + "</p>");
        writer.println("<p> Discount Price: " + priceAfter + "</p>");
        writer.println("</html>");
    }
}
