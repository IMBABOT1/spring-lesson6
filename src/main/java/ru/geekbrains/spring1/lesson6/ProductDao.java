package ru.geekbrains.spring1.lesson6;

import java.util.List;

public interface ProductDao {

    Product findById(Long id);
    List<Product> findAll();


}
