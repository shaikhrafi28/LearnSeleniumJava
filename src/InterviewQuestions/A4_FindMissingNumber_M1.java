package InterviewQuestions;

public class A4_FindMissingNumber_M1 {

	/*
	 * Algorithm:
	 * 1. Get the sum of numbers total = n*(n+1)/2 
	 * 2 Subtract all the numbers from sum and you will get the missing number.
	 * 
	 */

	public static void main(String[] args) {
		getMissingNo();
	}

	public static void getMissingNo() {
		int a[] = { 1, 2, 4, 5, 6, 7, 8, 9, 10 };
		int sum1 = 0, sum2 = 0;
		for (int i = 0; i < a.length; i++) {
			sum1 = sum1 + a[i];
		}

		for (int i = 1; i <= 10; i++) {
			sum2 = sum2 + i;
		}

		System.out.println("Missing Number is " + (sum2 - sum1));
	}

}
