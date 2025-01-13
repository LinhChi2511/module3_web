package com.example.exam.controller;

import com.example.exam.entity.MatBang;
import com.example.exam.service.IMatBangService;
import com.example.exam.service.MatBangServer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.util.List;

@WebServlet(name = "MatBangController", urlPatterns = "/matbang")
public class Controller extends HttpServlet {
    IMatBangService mbService = new MatBangServer();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                req.getRequestDispatcher("/WEB-INF/add.jsp").forward(req, resp);
                break;
            case "update":
                break;
            case "delete":
                break;
            default:
                List<MatBang> list = mbService.getAll();
                req.setAttribute("list", list);
                req.getRequestDispatcher("list.jsp").forward(req, resp);
        }
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                String maMb = req.getParameter("maMb");
                String trangThai = req.getParameter("trangThai");
                double dienTich = Double.parseDouble(req.getParameter("dienTich"));
                int tang = Integer.parseInt(req.getParameter("tang"));
                String loaiVP = req.getParameter("loaiVP");
                int gia = Integer.parseInt(req.getParameter("gia"));
                Date startDate = Date.valueOf(req.getParameter("startDate"));
                Date endDate = Date.valueOf(req.getParameter("endDate"));
                mbService.addMatBang(new MatBang(maMb,trangThai,dienTich,tang,loaiVP,gia,startDate,endDate));
                break;
        }
    }
}
