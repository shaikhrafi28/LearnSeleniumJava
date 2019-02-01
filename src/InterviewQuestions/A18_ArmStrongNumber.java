package InterviewQuestions;

public class A18_ArmStrongNumber {

	public static void main(String[] args) {

		if (IsArmStrongNumber(153))
			System.out.println(" Is Armstrong Number? : True");
		else
			System.out.println("Is Armstrong Number? :  False");

		GetArmstrongNumber(98888);

	}

	public static boolean IsArmStrongNumber(int num) {

		int r;
		int t;
		int cube = 0;

		t = num;// assigning nums value to t;num is empty

		while (num > 0) {
			r = num % 10;// To get the Last Num
			num = num / 10;// To decrease the value of num
			cube = cube + (r * r * r);

		}
		if (t == cube) {
			return true;

		} else {
			return false;

		}
	}

	public static void GetArmstrongNumber(int num) {
		for (int i = 1; i <= num; i++) {
			if (IsArmStrongNumber(i))
				System.out.print(i + " ");
		}
	}

}
