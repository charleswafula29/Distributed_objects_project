package com.ics.demo.models;

public class Department {
    private int studentId;
    private int departmentId;
    private int companyId;

    public Department(int studentId, int departmentId, int companyId) {
        this.studentId = studentId;
        this.departmentId = departmentId;
        this.companyId = companyId;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public int getCompanyId() {
        return companyId;
    }
}
