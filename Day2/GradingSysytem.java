package Java_Programs.Day2;

import java.util.Scanner;

public class GradingSysytem {

	public static void main(String[] args) {
		
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter marks to check Grade : ");
		int marks=obj.nextInt();
		
		if (marks==100) {
			System.out.println("S");
		}
		
		else if(marks>=90 & marks<=99) {
			System.out.println("A");
		}
		

		else if(marks>=80 & marks<=89) {
			System.out.println("B");
		}
		
		else if(marks>=70 & marks<=79) {
			System.out.println("C");
		}
		else if(marks>=60 & marks<=69) {
			System.out.println("D");
		}
		else if(marks>=50 & marks<=59) {
			System.out.println("E");
		}
		else if(marks<50) {
			System.out.println("F");
		}
	}

}
