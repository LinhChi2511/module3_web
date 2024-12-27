<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 25/12/2024
  Time: 4:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--c đại diện cho bộ thư viện--%>
<html>
<head>
    <title>Danh sách học sinh</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <button class="btn btn-primary" onclick="window.location.href='/student?action=create'">Thêm mới</button>
    <%--    tạo 1 nút khi nhấp vào thì sẽ chuyển hướng trang thành /student/create--%>
    <%--    dùng trick để k cần sử dụng nhiều file controller
            thêm 1 cái action bên trong link /student --%>

    <table class="table table-hover">
        <thead>
        <tr>
            <th>STT</th>
            <th>Tên</th>
            <th>Địa chỉ</th>
            <th>Điểm</th>
            <th>Tên lớp</th>
            <th colspan="2" style="text-align: center">Chỉnh sửa</th>
        </tr>
        </thead>
        <tbody>
        <%--        câu lệnh dưới tương đương với for (Student s: students) --%>
        <c:forEach items="${students}" var="student" varStatus="temp">
            <tr>
                <td>${temp.count}</td>
                    <%--                vòng lặp forEach hỗ trợ 1 biến varStatus--%>
                    <%--                .count bắt đầu từ 1 còn index từ 0--%>
                <td>${student.name}</td>
                <td>${student.address}</td>
                <td>${student.point}</td>
                <td>${student.className}</td>
                <td>
                    <button class="btn btn-warning">Sửa</button>
                </td>

                <td>
                    <button class="btn btn-danger" data-bs-toggle="modal" data-bs-target="#modalDelete${student.code}">
                            <%--                        data-bs-target ="#modalDelete" => quan tâm (trỏ) đến mục có id modalDelete --%>
                        Xóa
                    </button>
                </td>


                <div class="modal fade" id="modalDelete${student.code}" tabindex="-1"
                     aria-labelledby="exampleModalLabel${student.code}"
                     aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title" id="exampleModalLabel">Xóa</h5>
                                <button type="button" class="btn-close" data-bs-dismiss="modal"
                                        aria-label="Close"></button>
                            </div>
                            <div class="modal-body">
                                <p>Bạn có chắc chắn xóa học sinh có tên ${student.name} và id là ${student.code}?</p>
                                <small style="color: red; font-style: italic">Lưu ý: Hành động này không thể hoàn
                                    tác!</small>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Hủy</button>
                                <button type="button" class="btn btn-danger"
                                        onclick="window.location.href='/student?action=delete&code=${student.code}'">Xác
                                    nhận
                                </button>
                            </div>
                        </div>
                    </div>
                </div>


            </tr>

        </c:forEach>
        <%--c đại diện cho bộ thư viện--%>
        <%--       cách khai báo theo java, <% for (Student student: students)--%>
        <%--            thay vào đó sẽ sử dụng JSTL--%>
        </tbody>
    </table>
    <c:if test="${message != null}">
        <div class="alert alert-success" role="alert" id="message">
                ${message}
        </div>
    </c:if>
</div>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
<script>
    setTimeout(function (){
        document.getElementById("message").remove();
    },3000)
</script>
</html>
