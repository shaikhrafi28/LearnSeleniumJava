package InterviewQuestions;

public class A07_StringManipulation_M1 {

	public static void main(String[] args) {
		String str = "CAQH Project is a fucking shit";
		String str1 = "caqh Project is a fucking shit";
		
		
		// Length of the string
		System.out.println(str.length());

		// Character index
		System.out.println(str.charAt(8));

		// Returns 1st occurence of 's' from left.
		System.out.println(str.indexOf("s"));

		// Returns 2nd occurence of 's' from left.
		System.out.println(str.indexOf("s", str.indexOf("s") + 1));

		// Returns 3rd occurence of 's' from left.
		System.out.println(str.indexOf("s", str.indexOf("s", str.indexOf("s") + 1)));

		// Returns index of 1st character of the word.
		System.out.println(str.indexOf("Project"));

		// Returns -1 as there is no such string present.
		System.out.println(str.indexOf("Hello"));

		// String comparison - Case Sensitive
		System.out.println(str.equals(str1));//

		// String comparison - Case Insensitive
		System.out.println(str.equalsIgnoreCase(str1));// case

		// Substring
		System.out.println(str.substring(0, 9));// excludes char at 9

		String str2 = "  caqh   Project  ";
		// To trim Before and After space
		System.out.println(str2.trim());
		//To remove between space also-Replacing the blanks
		System.out.println(str2.replace(" ", ""));

		// Splitting a String 
		String str3 = "CAQH_Project_is_a_fucking_shit";
		String str3val[] = str3.split("_");
		for (int i = 0; i < str3val.length; i++) {
			System.out.println(str3val[i]);
		}

		// Concatenation
		String str4 = "Bhalu";
		System.out.println(str4.concat("Bunny"));

		// Important
		String x = "Bhalu";
		String y = "Bunny";
		int a = 100;
		int b = 200;

		System.out.println(x + y);
		System.out.println(a + b);
		System.out.println(x + y + a + b);
		System.out.println(a + b + x + y);
		System.out.println(x + y + (a + b));
	}

}
