// BinaryOutputRF.java
/*
********************************************
*********Programming Assignment #1**********
********Fundamentals of Programming*********
************Author: Kyler Riggs*************
*************Due Date: 9/15/15**************
*************Submitted: 9/8/15**************
********************************************	
*/

import java.util.Scanner;

public class BinaryOutputRF {
	static Scanner console=  new Scanner (System.in);
	public static void main (String [] args) {
		int base ;
		int number ;
		System.out.print ("\nPlease enter the base: ");
		base = console.nextInt();
		System.out.print ("\nPlease enter the number: ");
		number = console.nextInt();
		System.out.println ("\nYour base number is: " + number);
		System.out.println ("Your base is: " + base);
		System.out.print ("Your answer is: ");
		binaryOutput (number, base);
		System.exit ( 0 );

	}
	
	public static void binaryOutput (int number, int base) {
		if ( number != 0 ) {
		
			binaryOutput (number/base, base);
			System.out.print (number % base);
		}
	}
}
