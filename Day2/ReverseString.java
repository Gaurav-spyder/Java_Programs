package Java_Programs.Day2;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter String : ");
		String text=obj.nextLine();
		int len=text.length();
		System.out.println(len);
		String rev_text="";
		for (int i=len-1;i>=0;i--) {
			rev_text=rev_text+text.charAt(i);
		}
System.out.println(rev_text);
	}

}
