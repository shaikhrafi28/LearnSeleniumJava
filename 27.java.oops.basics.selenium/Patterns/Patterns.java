package Patterns;

import java.util.Scanner;

import Array.ArrayPractiseMethods;




public class Patterns {
	public static void main(String[] args) 
	{
		
		}
	
	
//=======================================================================================
	public static void Pattern1() {
		// FOR INPUT
		Scanner sc = new Scanner(System.in);

		// TAKING ROWS VALUE FROM THE USER

		System.out.println("How many rows you want in this pattern?");

		int rows = sc.nextInt();

		System.out.println("Here is your pattern....!!!");

		for (int i = 0; i <= rows; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}

	}

	public static void Pattern2() {

		char ab[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
				'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

		int size = ab.length;

		for (int i = 0; i < size; i++) {
			System.out.println(ab[i]);
		}
	}

}