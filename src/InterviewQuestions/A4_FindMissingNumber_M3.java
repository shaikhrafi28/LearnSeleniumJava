package InterviewQuestions;

public class A4_FindMissingNumber_M3 {

	/*
	 * XOR as "this or that, but not both!". METHOD 2(Use XOR)
	 * 
	 * 1) XOR all the array elements, let the result of XOR be X1. 
	 * 2) XOR all numbers from 1 to n, let XOR be X2. 
	 * 3) XOR of X1 and X2 gives the missing number.
	 * 
	 */

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 10 };
		int miss = getMissingNo(a, 9);
		System.out.println(miss);

	}

	public static int getMissingNo(int a[], int n) {
		int x1 = a[0];
		int x2 = 1;

		for (int i = 1; i < n; i++) {
			x1 = x1 ^ a[i];// 1^2 =
		}

		for (int i = 2; i <= n + 1; i++)
			x2 = x2 ^ i;

		return (x1 ^ x2);

	}
}
