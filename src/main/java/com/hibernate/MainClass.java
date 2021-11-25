package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainClass
{
    private static final Logger logger =LogManager.getLogger(MainClass.class);
    public static void main(String[] args) {
       Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory= cfg.buildSessionFactory();
        Customer customer1= new Customer();
        customer1.setCustomerId(101);
        customer1.setCustomerName("Prakash Mane");
        Vehicle vehicle1=new Vehicle();
        vehicle1.setVehicleId(11);
        vehicle1.setVehicleName("Honda");
        customer1.setVehicle(vehicle1);

        Customer customer2= new Customer();
        customer2.setCustomerId(102);
        customer2.setCustomerName("Suraj Patil");
        Vehicle vehicle2=new Vehicle();
        vehicle2.setVehicleId(12);
        vehicle2.setVehicleName("TATA");
        customer2.setVehicle(vehicle2);


        Session session=factory.openSession();
        Transaction transaction= session.beginTransaction();

        session.save(customer1);
        session.save(customer2);
session.save(vehicle1);
session.save(vehicle2);
        transaction.commit();



        factory.close();
    }
}
