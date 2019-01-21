package InterviewQuestions;



public class A02_RemoveJunk_M1 {

	public static void main(String[] args) {

		System.out.println(RemoveJunk("$%%^^&v&^$@8@VE$%%^^&&^$@@ERAJ#$%%^^&&^$@@"));

	}

	public static String RemoveJunk(String str) {

		String str1 = str.replaceAll("[^a-zA-Z0-9]", "");// Regular Expression
		return str1;
 
	}
}