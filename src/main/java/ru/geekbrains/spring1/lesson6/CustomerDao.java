package ru.geekbrains.spring1.lesson6;

import java.util.List;

public interface CustomerDao {

    Customer findById(Long id);
    List<Customer> findAll();

}
