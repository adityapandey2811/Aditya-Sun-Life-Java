package com.pack.assignment1;

public class Package {
    public static void main (String args[]){
        Student student=new Student();
        student.setStudentId(1);
        student.setStudentType('A');
        student.setStudentName("Aditya");
        student.getDetails();
    }
}