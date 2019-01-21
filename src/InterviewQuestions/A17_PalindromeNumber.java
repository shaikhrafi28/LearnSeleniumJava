package InterviewQuestions;

public class A17_PalindromeNumber {

	public static void main(String[] args) {
isPalindromeNumber(181);
	}
	
	public static void isPalindromeNumber(int num)
	{
		
	int r=0;
	int sum=0;
	int t;
	
	t=num;
	
	while(num>0) {
		r=num%10;
		sum = (sum*10)+r;
		num= num/10;
	}
	
	if(t==sum) {
		System.out.println("Palindrome");
	}
	else
	{
		System.out.println("Not Palindrome");	
	}
	}
	
	
	
	
	
	
}
