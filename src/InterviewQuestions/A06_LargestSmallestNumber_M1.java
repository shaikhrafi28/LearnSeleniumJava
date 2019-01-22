package InterviewQuestions;

import java.util.Arrays;

public class A06_LargestSmallestNumber_M1 {
//HashSet doesnt store duplicates.
	public static void main(String[] args) {
		int numbers[] = { 1, -100, 44, -66, 4, 2222, 896, 2, -4, -9, 889, 8 };
		FindLargestSmallest(numbers);
	}

	public static void FindLargestSmallest(int a[]) {

		int largest = a[0];
		int smallest = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] > largest) {
				largest = a[i];
			} else if (a[i] < smallest) {
				smallest = a[i];
			}
		}
		System.out.println("Given Array is " + Arrays.toString(a));
		System.out.println("Largest Number is " + largest);
		System.out.println("Smallest Number is " + smallest);
	}
}
