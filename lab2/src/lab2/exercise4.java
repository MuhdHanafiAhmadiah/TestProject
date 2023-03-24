package lab2;

import java.util.Scanner;

public class exercise4 {
	public static void main(String[] args) {
		
		System.out.println("Enter the number between 0 and 1000:");
		
		
		Scanner sc = new Scanner(System.in);
	
		int number = sc.nextInt();
		
		int t1 = 1+(number-100)/100;
		int t2 = (1+(number-10)/10)%10;
		int t3 = number%10;
		
		int product = t1*t2*t3;
		
	
		
		System.out.println("The multiplication of all digits is:");
		System.out.println(product);
		
		
		// Author’s name: Muhammad Hanafi Bin Ahmadiah
		// Matric number: 210568
		// Lab No: 2
}
}