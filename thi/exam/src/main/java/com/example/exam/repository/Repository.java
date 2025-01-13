package com.example.exam.repository;

import com.example.exam.entity.MatBang;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

public class Repository {
    private static final String FIND_ALL = "select * from matbang;";
    private static final String DELETE_MB = "delete from premises where maMb = ?";
    private static final String INSERT_MB = "insert into premises (maMb, trangThai ,dienTich,tang,loaiVP,giaThue,startDate,endDate)" +
            "values (?,?,?,?,?,?,?,?)";

    public List<MatBang> getAll() {
        List<MatBang> list = new ArrayList<>();
        try {
            PreparedStatement statement = BaseRepo.getConnection().prepareStatement(FIND_ALL);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                String maMB = resultSet.getString("maMB");
                String trangThai = resultSet.getString("trangThai");
                double dienTich = resultSet.getDouble("dienTich");
                int tang = resultSet.getInt("tang");
                String loaiVP = resultSet.getString("loaiMB");
                int gia = resultSet.getInt("gia");
                Date startDate = resultSet.getDate("ngay_bat_dau");
                Date endDate = resultSet.getDate("ngay_ket_thuc");
                list.add(new MatBang(maMB, trangThai, dienTich, tang, loaiVP, gia, startDate, endDate));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return list;
    }

    public void add(MatBang mb) {
        try {
            PreparedStatement statement = BaseRepo.getConnection().
                    prepareStatement(INSERT_MB);
//            4 dấu ? thay thế cho values để tránh lộ thông tin
            statement.setString(1, mb.getMaMB());
            statement.setString(2, mb.getTrangThai());
            statement.setDouble(3, mb.getDienTich());
            statement.setInt(4, mb.getTang());
            statement.setString(5, mb.getLoaiVP());
            statement.setInt(6, mb.getGia());
            statement.setDate(7, mb.getStartDate());
            statement.setDate(7, mb.getEndDate());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}