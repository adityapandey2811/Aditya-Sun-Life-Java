package com.pack.assignment1;

public class HostelLite extends Student {
	private String hostelName;
	private int roomNumber;
	public String getHostelName() {
		return hostelName;
	}
	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public HostelLite() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HostelLite(int studentId, char studentType, String studentName, double feesPerMonth, String hostelName,
			int roomNumber) {
		super(studentId, studentType, studentName, feesPerMonth);
		this.hostelName = hostelName;
		this.roomNumber = roomNumber;
	}
}
