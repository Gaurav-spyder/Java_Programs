package Java_Programs.Day2;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		
		int n = 5; 

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0 && (j == 0 || j == 3)) || 
                    (i == 1 && (j == 1 || j == 2)) ||
                    (i == 2 && j == 2) ||
                    (i == 3 && (j == 1 || j == 2)) ||
                    (i == 4 && (j == 0 || j == 3))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
		    }
		}
