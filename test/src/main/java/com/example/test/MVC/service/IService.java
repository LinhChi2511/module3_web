package com.example.test.MVC.service;

import java.util.List;

public interface IService<T> {
    List<T> getAll();
    void save(T t);
    void delete(int id);
    T findById(int id);
}
