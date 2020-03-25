package org.hibernateapp;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernateapp.crud.StudentCRUD;
import org.hibernateapp.entity.Student;

/**
 * Hello world!
 *
 */
public class StudentApp
{
    private static final SessionFactory sessionFactory;

    static {

        sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
    }

    public static void main( String[] args )
    {


        try
        {
            //StudentCRUD.createStudent(sessionFactory.getCurrentSession());
            StudentCRUD.readAllStudent(sessionFactory.getCurrentSession());
            //StudentCRUD.updateStudent(sessionFactory.getCurrentSession());
            //StudentCRUD.deleteStudent(sessionFactory.getCurrentSession());
            //StudentCRUD.readStudent(sessionFactory.getCurrentSession());
        }
        catch (Exception e)
        {
            sessionFactory.getCurrentSession().getTransaction().rollback();
        }
        finally
        {
            sessionFactory.close();
        }
    }
}
