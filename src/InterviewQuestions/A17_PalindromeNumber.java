package InterviewQuestions;

public class A17_PalindromeNumber {

	public static void main(String[] args) {
		isPalindromeNumber(181);
	}

	public static void isPalindromeNumber(int num) {

		int r = 0;
		int rev = 0;
		int t;

		t = num;// assigning nums value to t;num is empty

		while (num > 0) {
			r = num % 10;
			rev = (rev * 10) + r;
			num = num / 10;
		}

		if (t == rev) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}

}
