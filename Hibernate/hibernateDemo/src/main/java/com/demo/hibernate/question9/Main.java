package com.demo.hibernate.question9;

import com.demo.hibernate.Author;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
    Author author=new Author("Prateek","Nagar",23,new Date());

    Author author1=new Author("Lohit","Ahooja",35,new Date());

    Author author2=new Author("Gagan","Kushwaha",30,new Date());

    Author author3=new Author("Arpit.","Gupta",40,new Date());

    SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();

    Session session=sessionFactory.openSession();
        session.beginTransaction();

            session.save(author);
            session.save(author1);
            session.save(author2);
            session.save(author3);

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
