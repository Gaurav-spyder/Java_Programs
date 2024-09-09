package Java_Programs.Day2;

import java.util.Scanner;

public class HotelTarrif {

	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		System.out.print(" Enter Month number ");
		int month=obj.nextInt();
		System.out.print(" Enter room rent/day:  ");
		float rent=obj.nextFloat();
		System.out.print("Number of days stayed in hotel:  ");
		int stayed=obj.nextInt();
		switch (month){
		case 1:
			System.out.println(rent*stayed);
			break;
			
		case 2:
			System.out.println(rent*stayed);
			break;
		
		
		case 3:
			System.out.println(rent*stayed);
			break;
			
		case 4:
			float new_rent=rent+rent*20/100;
			System.out.println((new_rent)*stayed);
			break;
		case 5:
			float new_rent1=rent+rent*20/100;
			System.out.println((new_rent1)*stayed);
			break;
		case 6:
			float new_rent2=rent+rent*20/100;
			System.out.println((new_rent2)*stayed);
			break;	
			
		case 7:
			System.out.println(rent*stayed);
			break;
		
		case 8:
			System.out.println(rent*stayed);
			break;
		
		case 9:
			System.out.println(rent*stayed);
			break;
		
		case 10:
			System.out.println(rent*stayed);
			break;
		
		case 11:
			float new_rent3=rent+rent*20/100;
			System.out.println((new_rent3)*stayed);
			break;	
			
		case 12:
			float new_rent4=rent+rent*20/100;
			System.out.println((new_rent4)*stayed);
			break;	
	}

}
}