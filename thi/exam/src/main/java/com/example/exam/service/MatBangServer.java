package com.example.exam.service;

import com.example.exam.entity.MatBang;
import com.example.exam.repository.Repository;

import java.sql.Date;
import java.util.List;

public class MatBangServer implements IMatBangService {
    private static Repository matbang = new Repository();

    @Override
    public List<MatBang> getAll() {
        return matbang.getAll();
    }

    @Override
    public void addMatBang(MatBang matBang) {
        matbang.add(matBang);
    }

    @Override
    public void deleteMatBang(String maMb) {

    }

    @Override
    public List<MatBang> filterMatBang(String maMb, Date startDate, Date endDate, int tang) {
        return List.of();
    }
}
