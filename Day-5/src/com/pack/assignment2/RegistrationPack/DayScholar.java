package com.pack.assignment2;

import com.pack.assignment2.studentPack.Student;

public class DayScholar extends Student {
	private String residentialAddress; 
	public void setResAddress(String resAddress){ 
		this.residentialAddress=resAddress ; 
	}
	public void getDetails(){ 
		System.out.println("Student Id:"+getStudentId() + " Student Type:"+getStudentType()
			+ " Student Name:"+getStudentName());
	}
}
