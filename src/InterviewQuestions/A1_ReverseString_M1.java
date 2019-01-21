package InterviewQuestions;

public class A1_ReverseString_M1 {

	public static void main(String[] args) {

		System.out.println(ReverseOfString("VEERAj"));

	}

	public static String ReverseOfString(String str) {
		String revstring = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			revstring = revstring + str.charAt(i);
		}

		return revstring;

	}
}