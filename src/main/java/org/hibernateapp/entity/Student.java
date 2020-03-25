package org.hibernateapp.entity;

import javax.persistence.*;

@Entity
@Table(name="student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name="rollno")
    private String rollno;

    @Column(name = "name")
    private String name;

    @Column(name = "university")
    private String university;

    public Student() {
    }

    public Student(String rollno, String name, String university) {
        this.rollno = rollno;
        this.name = name;
        this.university = university;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", rollno='" + rollno + '\'' +
                ", name='" + name + '\'' +
                ", university='" + university + '\'' +
                '}';
    }
}
