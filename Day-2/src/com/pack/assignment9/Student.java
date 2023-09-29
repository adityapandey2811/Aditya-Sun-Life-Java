package assignment9;

public class Student {

	static int id = 550;
	private final int studentId;
	private char studentType;
	private String studentName;
	
	public Student() {
		this.studentId = id;
		id++;
	}
	
	public Student(char studentType, String fname, String lname) {
		super();
		this.studentId = id;
		this.studentType = studentType;
		this.studentName = fname + " " + lname;
		id++;
	}
	
	public void displayDetails(Student obj) {
		System.out.println("Student Id: "+this.studentId);
		System.out.println("Student type: "+this.studentType);
		System.out.println("Student Name: "+this.studentName);
	}

	public static void main(String[] args) {
		Student studentOne = new Student('D', "Bony", "Thomas");
		studentOne.displayDetails(studentOne);
		
		Student studentTwo = new Student('H', "Dinil", "Bose");
		studentTwo.displayDetails(studentTwo);

	}

}
