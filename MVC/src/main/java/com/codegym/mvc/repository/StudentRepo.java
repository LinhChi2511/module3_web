package com.codegym.mvc.repository;

import com.codegym.mvc.entity.Student;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
        List<Student> students = new ArrayList<>();
        try {
            PreparedStatement statement = BaseRepository.getConnection().prepareStatement("select * from students");
            ResultSet resultSet = statement.executeQuery();
//            thực hiện các câu lệnh truy xuất bth (như kiểu bắt đầu chạy) select... trả về danh sách record
//            dữ liệu sẽ được lưu trong ResultSet
//            executeUpdate(); thực hiện các thay đổi; các câu lệnh insert, delete,...
            while (resultSet.next()) {
//                tương tự như đọc file dùng line() để trỏ dòng thì next() cũng tương tự
//                khi chạy tới dòng cuối cùng thì kết quả trả về là FALSE kết thúc vòng lặp
                int id = resultSet.getInt("code");
                String name = resultSet.getString("name_student");
                String address = resultSet.getString("address");
                double point = resultSet.getDouble("point");
                String className = resultSet.getString("class_name");
                students.add(new Student(id, name, address, point, className));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return students;
    }

    public void save(Student s) {
        try {
            PreparedStatement statement = BaseRepository.getConnection().
                    prepareStatement("insert into students(name_student,address,point,class_name) values (?,?,?,?)");
//            4 dấu ? thay thế cho values để tránh lộ thông tin
            statement.setString(1, s.getName());
            statement.setString(2, s.getAddress());
            statement.setDouble(3, s.getPoint());
            statement.setString(4, s.getClassName());
            statement.executeUpdate();
//           câu lệnh thực thi update()
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        students.add(s);
    }

    public void deleteById(int id) {
        try {
            PreparedStatement statement = BaseRepository.getConnection().
                    prepareStatement("delete from students where code = ?");
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
//
//        List<Student> students1 = getAll();
//        for (Student s : students1) {
//            if (s.getCode() == id) {
//                students.remove(s);
//                break;
//            }
//        }
    }
}