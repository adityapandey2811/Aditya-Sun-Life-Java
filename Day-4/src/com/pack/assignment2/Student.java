package com.pack.assignment2;

public class Student {
	protected int studentId;
	protected char studentType;
	protected String studentName;
	protected double feesPerMonth;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public char getStudentType() {
		return studentType;
	}
	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public double getFeesPerMonth() {
		return feesPerMonth;
	}
	public void setFeesPerMonth(double feesPerMonth) {
		this.feesPerMonth = feesPerMonth;
	}
	public Student(int studentId, char studentType, String studentName, double feesPerMonth) {
		super();
		this.studentId = studentId;
		this.studentType = studentType;
		this.studentName = studentName;
		this.feesPerMonth = feesPerMonth;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentType=" + studentType + ", studentName=" + studentName
				+ ", feesPerMonth=" + feesPerMonth + "]";
	}
	
	
}
