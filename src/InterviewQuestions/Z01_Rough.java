package InterviewQuestions;

public class Z01_Rough {

	public static void main(String[] args) {
		Addcomma("helloworld");
	}

	public static void Addcomma(String a) {

		String str1 = "";
		String comma = ",";

		for (int i = 0; i <= a.length() - 1; i++) {
			str1 = (str1 + a.charAt(i) + comma);
		}
		System.out.println(str1);
	}
}
