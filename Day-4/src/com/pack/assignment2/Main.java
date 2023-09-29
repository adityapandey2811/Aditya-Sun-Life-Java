package com.pack.assignment2;

public class Main {
	public static void main(String[] args) {
		HostelLite hs = new HostelLite(1,'m',"Aditya",3000,"KP7",141);
		
		System.out.println(hs.getStudentId() + " " + hs.getStudentType() + " " + hs.getStudentName() 
			+ " " + hs.getFeesPerMonth() + " " + hs.getHostelName() + " " + hs.getRoomNumber());
		
		
	}
}
