package InterviewQuestions;

public class A1_ReverseString_M2 {

	public static void main(String[] args) {

		System.out.println(ReverseOfString("VEERAj"));

	}

	public static StringBuffer ReverseOfString(String str) {
		
		StringBuffer str1 = new StringBuffer(str);
		StringBuffer revstring = str1.reverse();

		return revstring;

	}
}