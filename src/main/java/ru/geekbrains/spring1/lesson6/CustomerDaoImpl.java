package ru.geekbrains.spring1.lesson6;

import org.hibernate.Session;

import java.util.List;

public class CustomerDaoImpl implements CustomerDao{
    protected SessionFactoryUtils sessionFactoryUtils;

    public CustomerDaoImpl(SessionFactoryUtils sessionFactoryUtils) {
        this.sessionFactoryUtils = sessionFactoryUtils;
    }


    @Override
    public Customer findById(Long id) {
        Session session = sessionFactoryUtils.getSession();
        session.beginTransaction();
        Customer c = session.get(Customer.class, id);
        session.getTransaction().commit();
        return c;
    }

    @Override
    public List<Customer> findAll() {
        Session session = sessionFactoryUtils.getSession();
        session.beginTransaction();
        List<Customer> customers = session.createQuery("SELECT c FROM Customer c").getResultList();
        session.getTransaction().commit();
        return customers;
    }

}
