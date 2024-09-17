package Java_Programs.Day4;

public class StringIndexOutOfBoundsException {

	public static void main(String[] args) {
		
		String name ="Guvi";
		
		try {
			String substring=name.substring(2, 9);
		}
		finally {
			System.out.println("Continuing the below codes");
			
		}

	}

}
