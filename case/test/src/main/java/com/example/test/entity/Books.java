package com.example.test.entity;

public class Books {
    private int book_ID;
    private String book_Name;
    private String author;
    private String publisher;
    private int book_ISBN;
    private int price;
    private int stock;
    private int category_ID;

    public Books(){}

    public Books(int book_ID, String book_Name, String author, String publisher, int book_ISBN, int price, int stock, int category_ID) {
        this.book_ID = book_ID;
        this.book_Name = book_Name;
        this.author = author;
        this.publisher = publisher;
        this.book_ISBN = book_ISBN;
        this.price = price;
        this.stock = stock;
        this.category_ID = category_ID;
    }

    public Books(String book_Name, String author, String publisher, int book_ISBN, int price, int stock, int category_ID) {
        this.book_Name = book_Name;
        this.author = author;
        this.publisher = publisher;
        this.book_ISBN = book_ISBN;
        this.price = price;
        this.stock = stock;
        this.category_ID = category_ID;
    }

    public int getBook_ID() {return book_ID;}
    public void setBook_ID(int book_ID) {this.book_ID = book_ID;}
    public String getBook_Name() {return book_Name;}
    public void setBook_Name(String book_Name) {this.book_Name = book_Name;}
    public String getAuthor() {return author;}
    public void setAuthor(String author) {this.author = author;}
    public String getPublisher() {return publisher;}
    public void setPublisher(String publisher) {this.publisher = publisher;}
    public int getBook_ISBN() {return book_ISBN;}
    public void setBook_ISBN(int book_ISBN){this.book_ISBN = book_ISBN;}
    public int getPrice() {return price;}
    public void setPrice(int price) {this.price = price;}
    public int getStock() {return stock;}
    public void setStock(int stock) {this.stock = stock;}

    public int getCategory_ID() {return category_ID;}
    public void setCategory_ID(int category_ID) {this.category_ID = category_ID;}
}
