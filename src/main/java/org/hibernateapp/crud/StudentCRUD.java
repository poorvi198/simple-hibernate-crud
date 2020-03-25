package org.hibernateapp.crud;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.hibernateapp.entity.Student;

import java.util.ArrayList;

public class StudentCRUD {

    public static void createStudent(Session session) {
        session.beginTransaction();
        Student student = new Student("RN9","romi","manit");
        session.save(student);
        session.getTransaction().commit();
    }


    public static void readAllStudent(Session session) {
        session.beginTransaction();
        Query query = session.createQuery("from Student");
        ArrayList<Student> students = (ArrayList<Student>) query.list();
        System.out.println(students);
        session.getTransaction().commit();
    }

    public static void updateStudent(Session session) {
        session.beginTransaction();
        Query query = session.createQuery("update Student set name='rishabh' , rollno='RN12' where id = 10");
        query.executeUpdate();
        session.getTransaction().commit();
    }

    public static void deleteStudent(Session session) {
        session.beginTransaction();
        Student student = session.get(Student.class,11);
        session.delete(student);
        session.getTransaction().commit();
    }

    public static void readStudent(Session session) {
        session.beginTransaction();
        Student student = session.get(Student.class,10);
        System.out.println(student);
        session.getTransaction().commit();
    }
}
