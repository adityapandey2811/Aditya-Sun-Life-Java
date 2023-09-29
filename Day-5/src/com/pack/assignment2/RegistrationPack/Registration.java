package com.pack.assignment2.RegistrationPack;

class Registration{ 
	public static void main (String args[]){ 
		DayScholar dayScholar=new DayScholar(); 
		dayScholar.setStudentId(1);
		dayScholar.setStudentType('A');
		dayScholar.setStudentName("Aditya");
		dayScholar.getDetails(); 
	}
} 