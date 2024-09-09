package Java_Programs.Day2;

import java.util.Scanner;

public class FindLargest {

	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		System.out.print(" Enter first number ");
		int fnum=obj.nextInt();
		System.out.print(" Enter second number :  ");
		int snum=obj.nextInt();
		System.out.print("Enter third number:  ");
		int tnum=obj.nextInt();
		
		if(fnum>snum & fnum>tnum) {
			System.out.println(fnum + " is largest");
		}
		
		else if (snum>fnum & snum>tnum ) {
			System.out.println(snum + " is largest");
		}
		else {
			System.out.println(tnum + " is largest");
		}

	}

}
