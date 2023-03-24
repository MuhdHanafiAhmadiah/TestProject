package lab2;

import java.util.Scanner;

public class exercise3 {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
		
			System.out.println("Retail Price (RM):");
			double retail = sc.nextDouble();
			
			
			System.out.println("Sales Tax Rate (%):");
			double sales_tax_rate = sc.nextDouble();
			
			double sales_tax = retail * sales_tax_rate/100;
			double total = retail + sales_tax;
			
			System.out.println("Sales Tax is RM" + String.format("%.2f", sales_tax));
			System.out.println("Total Sale is RM" + String.format("%.2f", total));
			
		// Author’s name: Muhammad Hanafi Bin Ahmadiah
		// Matric number: 210568
		// Lab No: 2
	}
}
