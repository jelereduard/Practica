package com.example.documentepractica.student;

import javax.persistence.*;

@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Integer id;
    private String firstName;
    private String lastName;
    private Integer studentGroup;
    private String mail;
    private Boolean marked;

    public Student() {
    }

    public Student(String firstName, String lastName, Integer studentGroup, String mail, Boolean marked) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentGroup = studentGroup;
        this.mail = mail;
        this.marked = marked;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getGroup() {
        return studentGroup;
    }

    public void setGroup(Integer studentGroup) {
        this.studentGroup = studentGroup;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Boolean isMarked() {
        return marked;
    }

    public void setMarked(Boolean marked) {
        this.marked = marked;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentGroup=" + studentGroup +
                ", mail='" + mail + '\'' +
                ", marked=" + marked +
                '}';
    }
}
