package assignment8;

public class class1 {

	static int i = 22, j = 14000;
	static boolean k, l;
	public static void main(String[] args) {
		i = 22;
		j = 14000;
		class1 class1 = new class1();
		k = class1.Method1(i);
		l = class1.Method2(j);
		if(k && l)
			System.out.println("Is a new Employee");
		else System.out.println("Is not a new employee");
	}

	public boolean Method1(int i) {
        return i > 20 && i < 30;
	}
	
	public boolean Method2(int i) {
        return i > 14000 && i < 20000;
	}
}
