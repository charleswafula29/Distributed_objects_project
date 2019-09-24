package com.ics.demo.models;

public class Appointment {

    private int studentId;
    private int teacherId;

    public Appointment(int studentId, int teacherId) {
        this.studentId = studentId;
        this.teacherId = teacherId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
}
