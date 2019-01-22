package InterviewQuestions;

import java.util.Arrays;

public class A08_SwapIntegers_M1 {

	public static void main(String[] args) {

		SwapNumber1(5, 9);
		SwapNumber2(5, 9);
		SwapNumber3(5, 9);
		SwapNumber4(5, 9);
	}

	public static void SwapNumber1(int x, int y) {
		int temp;
		temp = x;
		x = y;
		y = temp;

		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}

	public static void SwapNumber2(int x, int y) {

		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
	
	public static void SwapNumber3(int x, int y) {

		x = x*y;
		y = x/y;
		x = x/y;

		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
	
	public static void SwapNumber4(int x, int y) {

		x = x^y;
		y = x^y;
		x = x^y;

		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}

}
