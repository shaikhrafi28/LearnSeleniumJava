package InterviewQuestions;

public class PalindromeString {

	public static void main(String[] args) {
		isPalindromeString("VEEREEV");
	}

	public static void isPalindromeString(String  str)
	{
		
	String reverse = "";
	
	for(int i = str.length()-1;i>=0;i--) {
		reverse = reverse + str.charAt(i);
	}
	System.out.println(reverse);

	
	if(str.equalsIgnoreCase(reverse)) {
		System.out.println("Palindrome");
	}
	else
	{
		System.out.println("Not Palindrome");	
	}
	}

}
