package Java_Programs.Day4;

import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int num1=s.nextInt();
		System.out.println("Enter 2nd number: ");
		int num2=s.nextInt();
		
		
		try {
			int divide=num1/num2;
		}
		
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		float divide =num1/num2;
		System.out.println(divide);
	}

}
