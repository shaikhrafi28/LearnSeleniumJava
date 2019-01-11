package InterviewQuestions;

public class CheckPrimeNumber {

	public static boolean isPrime(int num) {
		// Corner case
		if (num < 1) {
			return false;
		}

		// Check from 2 to n-1
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}

		}
		      return true;

	}

	public static void main(String[] args) {
		if (isPrime(76))
			System.out.println(" True");
		else
			System.out.println(" False");
	}
}
