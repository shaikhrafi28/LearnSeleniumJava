package InterviewQuestions;

public class A19_FindFactorial {

	public static void main(String[] args) {

		System.out.println(FactorialOf(4));
		
		System.out.println(RFactorialOf(4));

	}

//Without Recursive
	public static int FactorialOf(int num) {
		int fact = 1;
		if (num == 0)
			return 1;
		for (int i = 1; i <= num; i++) {

			fact = fact * i;
		}
		return fact;
	}

// With Recursive

	public static int RFactorialOf(int num) {
		if (num == 0)
			return 1;
		else
			return (num * RFactorialOf(num - 1));
	}

}
