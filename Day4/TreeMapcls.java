package Java_Programs.Day4;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;


public class TreeMapcls {

		
		public static void main(String[] args) {
			TreeMap <Integer,String> tm=new TreeMap<>();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number of elements you want : ");
			int num=sc.nextInt();
			for (int i=0;i<num;i++) {
				System.out.println("Enter elements in treemap separated by space: ");
				int empId=sc.nextInt();
				String empName=sc.next();
				tm.put(empId, empName);
				

			}
			System.out.println(tm + " Orginal Tree Map EmpId - EmpName pairs");
			ArrayList<String> al = new ArrayList<>(tm.values());
			Collections.sort(al);
			System.out.println(" ");
			System.out.println(al + " After sorting EmpId values");

		}
}