package com.example.bt1;

public class Customer {
    private String name;
    private String doB; //
    private String address;

    public Customer(){}

    public Customer(String name, String doB, String Address) {
        this.name = name;
        this.doB = doB;
        this.address = Address;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDoB() { return doB; }
    public void setDoB(String doB) { this.doB = doB; }
    public String getAddress() { return address; }
    public void setAddress(String Address) { this.address = Address; }


}
