package InterviewQuestions;

public class A16_PrimeNumber_M1 {

	public static void main(String[] args) {
		if (isPrime(7))
			System.out.println(" Is Prime Number? : True");
		else
			System.out.println("Is Prime Number? :  False");

		getPrimeNumber(100);
	}

	public static boolean isPrime(int num) {
		// Corner case
		if (num <= 1) {
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

	public static void getPrimeNumber(int num) {
		for (int i = 2; i < num; i++) {
			if (isPrime(i))
				System.out.print(i + " ");

		}
	}

}
