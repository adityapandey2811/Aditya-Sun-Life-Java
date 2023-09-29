package com.pack.assignment5;

public class Student {
    private static int currentStudentID;
    protected int studentId;
    protected char studentType;
    protected String studentName;

    public Student() {
        super();
        this.studentId=++currentStudentID;
    }

    public Student(int studentId, char studentType, String studentName) {
        this.studentId = studentId;
        this.studentType = studentType;
        this.studentName = studentName;
    }
}

