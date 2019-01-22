package InterviewQuestions;

import java.util.Arrays;

public class A09_SwapStrings_M1 {

	public static void main(String[] args) {

		SwapString1("Bhalu", "Bunny");
		
	}

	public static void SwapString1(String M, String F) {
		
		M=M+F;//BhaluBunny
		F=M.substring(0, (M.length()-F.length()));//Bhalu
		M=M.substring(F.length());
		 
		
		
		System.out.println("M = "+M);
		System.out.println("F = "+F);
	}

	

}
