package Strings;

public class StringPractiseMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringPractiseMethods objs = new StringPractiseMethods();
		/*
		 * objs.GetCharOfIndexWay1(); 
		 * objs.GetCharOfIndexWay2();
		 * objs.GetCharOfIndexWay3(); 
		 * objs.GetIndexOfChar(); 
		 * objs.PrintFromIndex();
		 */
		objs.PrintFromIndex();

	}

	public void GetCharOfIndexWay1() {
		// STRING IS A PREDEFINED CLASS PRESENT IN JAVA PACKAGE
		String str1 = "Payment $200 Paid";

		System.out.println(str1.charAt(6));
	}

	public void GetCharOfIndexWay2() {

		String str2 = new String();
		str2 = "Payment $200 Paid";
		System.out.println(str2.charAt(8));
	}

	public void GetCharOfIndexWay3() {
		String str3 = new String("Payment $200 Paid");
		System.out.println(str3.charAt(9));
	}

	public void GetIndexOfChar() {
		String str4 = "Payment $200 Paid";
		// to print index number of particular value.
		System.out.println(str4.indexOf("2"));
	}

	
	
	
	public void PrintFromIndex() {
		String str4 = "Payment $200 Paid";
		// to print from particular index
		System.out.println(str4.substring(8));

	}

//=======================================================================================	
	public void ReverseString() {    
		// palindrome
		String s = "VEERAJ";
		// for concatenating 2 strings
		String m = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			// System.out.println(s.charAt(i));

			m = m + s.charAt(i);
			
		}

	System.out.println("Reverse is " + m);

		if (s.equalsIgnoreCase(m)) {
			System.out.println(s + "  is a PALINDROME ");
		} else {
			System.out.println(s + "  is not a PALINDROME ");
		}
	}

}
