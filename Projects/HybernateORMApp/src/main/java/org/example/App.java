package org.example;

import org.example.model.Goal;
import org.example.model.Item;
import org.example.model.Passport;
import org.example.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Configuration configuration = new Configuration()
                .addAnnotatedClass(Item.class)
                .addAnnotatedClass(Person.class)
                .addAnnotatedClass(Passport.class)
                .addAnnotatedClass(Goal.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();

//            Person tom = new Person("Tom", 34);
//            Person jane = new Person("Jane", 50);
//
//            Goal readBigBook = new Goal("Read realy big book");
//            Goal cookSoup = new Goal("Make a soup");
//            Goal winTheFirstPlace = new Goal("WinTheFirstPlace");
//
//            tom.addGoal(readBigBook);
//            tom.addGoal(winTheFirstPlace);
//
//            jane.addGoal(cookSoup);
//            jane.addGoal(winTheFirstPlace);
//
//            session.persist(tom);
//            session.persist(jane);

            // tom - removed read big book

            session.getTransaction().commit();
        } finally {
            sessionFactory.close();
        }
    }
}
