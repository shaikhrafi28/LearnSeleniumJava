package InterviewQuestions;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		
		SwapNumbers b1 = new SwapNumbers();
	    b1.swapnum1();
		
	
	}

	public void swapnum1() {

		int a = 100;
		int b = 50;

		a = a + b;// 150
		b = a - b;// 150-50 = 100
		a = a - b;// 150-100 =50

		System.out.println("After swaping:" + " a = " + a + ",b = " + b);

	}

	public void swapnum2() {

		int a = 100;
		int b = 50;

		a = a * b;// 100*50
		b = a / b;// 100
		a = a / b;//

		System.out.println("After swaping:" + " a = " + a + ",b = " + b);

	}

	public void swapnum3() {

		int a = 100;
		int b = 50;
		int temp;

		temp = a; // temp = 100
		a = b;// a=50
		b = temp;// b= 100

		System.out.println("After swaping:" + " a = " + a + ",b = " + b);

	}

	public void swapnum4() {

		int x, y, temp;

		System.out.println("Enter x and y");

		Scanner in = new Scanner(System.in);

		x = in.nextInt();
		y = in.nextInt();

		System.out.println("Before Swapping\ny= " + x + "\ny = " + y);

		temp = x;
		x = y;
		y = temp;

		System.out.println("After Swapping\ny = " + x + "\ny = " + y);
	}

	
	
	
	
}
