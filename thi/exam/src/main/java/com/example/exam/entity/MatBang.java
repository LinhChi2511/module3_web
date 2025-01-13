package com.example.exam.entity;

import java.sql.Date;

public class MatBang {
    private String maMB;
    private String trangThai;
    private double dienTich;
    private int tang;
    private String loaiVP;
    private int gia;
    private Date startDate;
    private Date endDate;

    public MatBang() {}

    public MatBang(String maMB, String trangThai, double dienTich, int tang, String loaiVP, int gia, Date startDate, Date endDate) {
        this.maMB = maMB;
        this.trangThai = trangThai;
        this.dienTich = dienTich;
        this.tang = tang;
        this.loaiVP = loaiVP;
        this.gia = gia;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getMaMB() {return maMB;}
    public void setMaMB(String maMB) {this.maMB = maMB;}
    public String getTrangThai() {return trangThai;}
    public void setTrangThai(String trangThai) {this.trangThai = trangThai;}
    public double getDienTich() {return dienTich;}
    public void setDienTich(double dienTich) {this.dienTich = dienTich;}
    public int getTang(){return tang;}
    public void setTang(int tang){this.tang = tang;}
    public String getLoaiVP() {return loaiVP;}
    public void setLoaiVP(String loaiVP) {this.loaiVP = loaiVP;}
    public int getGia() {return gia;}
    public void setGia(int gia) {this.gia = gia;}
    public java.sql.Date getStartDate() {return startDate;}
    public void setStartDate(Date startDate) {this.startDate = startDate;}
    public Date getEndDate() {return endDate;}
    public void setEndDate(Date endDate) {this.endDate = endDate;}
}
