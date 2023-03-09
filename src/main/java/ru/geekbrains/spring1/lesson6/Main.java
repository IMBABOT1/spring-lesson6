package ru.geekbrains.spring1.lesson6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("ru.geekbrains.spring1.lesson6");

        SessionFactoryUtils sessionFactoryUtils = new SessionFactoryUtils();
        sessionFactoryUtils.init();
        ProductDao productDao = new ProductDaoImpl(sessionFactoryUtils);
        CustomerDao customerDao = new CustomerDaoImpl(sessionFactoryUtils);

        Product p = productDao.findById(1l);
        System.out.println(p.getCustomers());

        Customer c = customerDao.findById(1l);
        System.out.println(c.getProducts());


        context.close();

    }
}
