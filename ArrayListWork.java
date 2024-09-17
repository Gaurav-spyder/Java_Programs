package Java_Programs.Day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListWork {

	public static void main(String[] args) {
		System.out.println("Enter 5 names  in the Array List");
		ArrayList<String> userName =new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		String j;
		for (int i=0;i<5;i++) {
		
			 j=sc.nextLine();
			 userName.add(j);
		}
		System.out.println(userName);
		System.out.println("Removing all elements from the userName Array");
		userName.removeAll(userName);
		System.out.println(userName);
	}
}
