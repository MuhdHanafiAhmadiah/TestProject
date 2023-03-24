package lab2;

import java.util.Scanner;

public class exercise1 {
	public static void main(String[] args) {
	double kilo = 1.6;
	
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter mile: ");
	int mile= sc.nextInt();
	double total = mile*kilo;
	
	System.out.println( total);
	System.out.println("Total= " + String.format("%.2f", total));
		
		// Author’s name: Muhammad Hanafi Bin Ahmadiah
	   // Matric number: 210568
	  // Lab No: 2
	}
}
