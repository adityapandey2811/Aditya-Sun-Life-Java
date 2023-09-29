package assignment5;

public class javaDoc {

	public static void main(String[] args) {
		String userName = "Aditya";
		System.out.println("Length: "+userName.length());
		System.out.println("Hi "+userName);
		System.out.println(userName.toLowerCase());

		if(userName.startsWith("A"))
			System.out.println("Starts with A");
		else System.out.println("Does not starts with A");
	}

}
