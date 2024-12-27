package com.codegym.mvc.entity;

public class Student extends Person {
    private float point;
    private String className;

    public Student(){}

    public Student(long code, String name, String address, float point, String className) {
        super(code, name, address);
        this.point = point;
        this.className = className;
    }

    public Student(String name, String address, float point, String className) {
        super(name, address);
        this.point = point;
        this.className = className;
    }

    public float getPoint() {return point;}
    public void setPoint(float point) {this.point = point;}
    public String getClassName() {return className;}
    public void setClassName(String className) {this.className = className;}

    public String toString(){
        return super.toString()+" Student: [ Point: "+point+"; Class: "+className +"]";
    }
}
