package com.home;

import org.hibernate.Session;

import com.model.Employee;
import com.util.HibernateUtil;

public class Client {
	public static void main( String[] args )
    {
        System.out.println("Hibernate : MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        session.beginTransaction();
        Employee emp = new Employee();
        
        emp.setFirstname("sachin");
        emp.setLastname("shinde");
        
        session.save(emp);
        session.getTransaction().commit();
    }
}
