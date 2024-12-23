package com.example.th3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ConverterServlet", value = "/convert")
public class CurrencyConvert extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float usd = Float.parseFloat(request.getParameter("usd"));
        float rate = Float.parseFloat(request.getParameter("rate"));

        float vnd = usd * rate;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1> Rate: "+rate+ " </h1>");
        writer.println("<h1> USD: "+usd+ " </h1>");
        writer.println("<h1> vnd: "+vnd+ " </h1>");
        writer.println("</html>");

    }
}