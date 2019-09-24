package com.ics.demo.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


public class Student {

    private int studentNumber;

    private String firstName;

    public Student(int studentNumber, String firstName) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
