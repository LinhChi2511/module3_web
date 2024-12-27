package com.codegym.mvc.controller;

import com.codegym.mvc.entity.Student;
import com.codegym.mvc.service.IStudentService;
import com.codegym.mvc.service.impl.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "studentController", urlPatterns = "/student")
public class StudentController extends HttpServlet {

    private IStudentService studentService = new StudentService();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String action = req.getParameter("action");
//        tiếp nối trong phần button -> nhận giá trị biến action
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                req.getRequestDispatcher("/WEB-INF/view/student/create.jsp").forward(req, resp);
//               sử dụng để chuyển tiếp yêu cầu (req) và phản hồi (resp) đến 1 JSP cụ thể, trong trường hợp này là create.jsp nằm trong thư mục /web-inf/view/student
                break;
                case "update":
                    break;
            case "delete":
                int id = Integer.parseInt(req.getParameter("code"));
                studentService.remove(id);
                resp.sendRedirect("/student?message=deleted");
//                sau khi xóa thì cần hiển thị 1 thông báo xác nhận đã xóa thành công.
//                code trên giúp chuyển hướng trang sang nơi có message = delete
                break;
            default:
                String message = req.getParameter("message");
                if (message != null) {
                    if (message.equals("deleted")) {
                        req.setAttribute("message","Xóa thành công");
                    } else if(message.equals("created")) {
                        req.setAttribute("message","Thêm mới thành công");
                    }
                }
                List<Student> students = studentService.getAll();
                req.setAttribute("students", students);
//                chuyển dữ liệu (danh sách sinh viên) từ servlet sang JSP qua yêu cầu
//                students là đối tượng chứa dữ liệu muốn gửi sang JSP
//                "students" là tên thuộc tính mà bạn sẽ sử dụng trong JSP để truy xuất giá trị
                req.getRequestDispatcher("/WEB-INF/view/student/list.jsp").forward(req, resp);
//                chuyển tiếp yêu cầu và phản hồi đến trang JSP (list.jsp) để hiển thị danh sách sinh viên
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                String name = req.getParameter("name");
                String address = req.getParameter("address");
                float point = Float.parseFloat(req.getParameter("point"));
                String className = req.getParameter("className");
//                truyền giá trị như module 2
                Student student = new Student(name,address,point,className);
                studentService.save(student);
                resp.sendRedirect("/student");
//               chuyển hướng trang web trả về lại URL /student
                break;
        }
    }
}

