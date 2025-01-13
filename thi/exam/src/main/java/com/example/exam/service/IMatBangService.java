package com.example.exam.service;

import com.example.exam.entity.MatBang;

import java.sql.Date;
import java.util.List;

public interface IMatBangService {
    List<MatBang> getAll();

    void addMatBang(MatBang matBang);

    void deleteMatBang(String maMb);

    List<MatBang> filterMatBang (String maMb, Date startDate, Date endDate, int tang) ;
}
