package com.pack.assignment8;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		HostelLite hs = new HostelLite(1,'m',"Aditya",3000,"KP7",141);
//		
//		System.out.println(hs.getStudentId() + " " + hs.getStudentType() + " " + hs.getStudentName() 
//			+ " " + hs.getFeesPerMonth() + " " + hs.getHostelName() + " " + hs.getRoomNumber());
//		
		Student s = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Residential Status(HostelLite or DayScholar): ");
		String residentialStatus = sc.nextLine();
		
		
		if(residentialStatus.equalsIgnoreCase("hostellite")) {
			s = new HostelLite(1, 'm', "Aditya", 3000);
			s.displayStudentDetails();
		} else if(residentialStatus.equalsIgnoreCase("dayscholar")) {
			s = new DayScholar(1, 'm', "Anand", 0);
			s.displayStudentDetails();
		} else {
			System.out.println("Invalid Input");
		}
		System.out.println(s.calculateFess(100.0));
		
	}
}
