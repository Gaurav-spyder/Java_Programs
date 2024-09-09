package Java_Programs.Day2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	
		int r;
		int sum=0;
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter Number to check for Palindrome or not : ");
		int num=obj.nextInt();
		int flag=num; 
		int c=0;
		while(num>0) {
			 r=num%10;
			 sum=sum*10+r;
			 num=num/10;

	}
if (sum==flag) {
	System.out.println(flag+ " is palindrome");
}
else {
	System.out.println(flag+ " is not palindrome");
}
}
}
