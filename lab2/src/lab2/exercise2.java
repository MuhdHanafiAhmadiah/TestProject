package lab2;

import java.util.Scanner;

public class exercise2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		final double FOOT_PER_METER =3.2786 ;

		System.out.print("Enter a value for meter: ");
		double meter = input.nextDouble();

		double feet = meter * FOOT_PER_METER;

		System.out.println(meter + " meters is " + feet + " feet");
		
		// Author's name: Muhammad Hanafi Bin Ahmadiah
		// Matric number: 210568
		// Lab No: 2
		
		
		
	}
}