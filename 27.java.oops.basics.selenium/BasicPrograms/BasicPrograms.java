package BasicPrograms;

import java.util.Scanner;

public class BasicPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicPrograms b1 = new BasicPrograms();
		//b1.swapnum1();
		//b1.reverse1();
		b1.Fibonaci();
	}

	
	public void swapnum1() {
		
		int a = 100;
		int b = 50;
		
		a = a+b;//150
		b = a-b;//150-50 = 100
		a = a-b;//150-100 =50
		
		System.out.println("After swaping:"
	             + " a = " + a + ",b = " + b);
		
		
	}
	
	
public void swapnum2() {
		
		int a = 100;
		int b = 50;
		
		a = a*b;//100*50
		b = a/b;//100
		a = a/b;//
		
		System.out.println("After swaping:"
	             + " a = " + a + ",b = " + b);
		
		
		
	}
public void swapnum3() {
	
		int a = 100;
		int b = 50;
		int temp;

		temp = a; // temp = 100
		a = b;// a=50
		b = temp;// b= 100

	System.out.println("After swaping:"
             + " a = " + a + ",b = " + b);
	
	
	
}


public void swapnum4() {
	
	int x, y, temp;
	
    System.out.println("Enter x and y");
    
    Scanner in = new Scanner(System.in);

    x = in.nextInt();
    y = in.nextInt();

    System.out.println("Before Swapping\ny= "+x+"\ny = "+y);

    temp = x;
    x = y;
    y = temp;

    System.out.println("After Swapping\ny = "+x+"\ny = "+y);
 }
	
	




public void ReverseStatic() {
	
	String a = "45012";
	
	String b ="";
	
	for(int i=a.length()-1;i>=0;i--) 
	
	{
		b=b+ a.charAt(i);
	}
	
	System.out.println("Reverse is " + b);
	
		
}

public void ReverseDynamic() {
	
	String a;
	System.out.println("Enter string");
	Scanner in = new Scanner(System.in);
	a=in.next();
	String b ="";
	
	for(int i=a.length()-1;i>=0;i--) 
	
	{
		b=b+ a.charAt(i);
	}
	
	System.out.println("Reverse is " + b);
	
		
}


public void Fibonaci() {
	
	int maxNumber = 0; 
	int previousNumber = 0;
	int nextNumber = 1;
		
	System.out.println("How many numbers you want in Fibonacci:");
	
	Scanner scanner = new Scanner(System.in);
	maxNumber = scanner.nextInt();
	
	System.out.print("Fibonacci Series of "+maxNumber+" numbers:");	
	
	for (int i = 1; i <= maxNumber; i++)
		{
		System.out.print(previousNumber+" ");
		int sum = previousNumber + nextNumber;
		previousNumber = nextNumber;
		nextNumber = sum;
		}
	
			}

		


	
		
}




