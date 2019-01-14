package InterviewQuestions;

public class CheckArmStrongNumber {

	public static void main(String[] args) {
		if (ArmStrongNumber(153))
			System.out.println(" Is ArmStrong Number? : True");
		else
			System.out.println(" Is ArmStrong Number? :  False");
	}

	public static boolean ArmStrongNumber(int num) {
		
		
		int r=0;
		int cube;
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

	
	}


