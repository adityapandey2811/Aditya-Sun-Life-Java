package assignment3;

public class JaggedArray {

	public static void main(String[] args) {
		String[][] array1 = {
				{"Tony", "JAVA", "C", "C++"},
				{"Thomas", "JAVA", "UNIX"},
				{"Dinil", "Linux", "Oracle"},
				{"Delvin", "RDMS", "C#", "ORACLE"}
				};
        for (String[] strings : array1) {
            if ("Delvin".equals(strings[0]))
                for (String string : strings) System.out.print(string + " ");
        }
	}

}
