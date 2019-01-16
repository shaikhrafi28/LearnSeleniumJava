package InterviewQuestions;

public class ReverseInteger {

	public static void main(String[] args) {
		System.out.println(ReverseOfNumber(-1234));
	}

	public static int ReverseOfNumber(int num) {
                                 		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		return rev;

	}
}