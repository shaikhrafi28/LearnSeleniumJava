package InterviewQuestions;

public class A07_StringManipulation_M1 {

	public static void main(String[] args) {
		String str = "CAQH Project is a fucking shit";
		String str1 = "caqh Project is a fucking shit";

		System.out.println(str.length());// Gives length.

		System.out.println(str.charAt(8));

		System.out.println(str.indexOf("s"));// Returns 1st occurence of 's' from left.
		System.out.println(str.indexOf("s", str.indexOf("s") + 1));// Returns 2nd occurence of 's' from left.
		System.out.println(str.indexOf("s", str.indexOf("s", str.indexOf("s") + 1)));

		System.out.println(str.indexOf("Project"));
		System.out.println(str.indexOf("Hello"));// Returns -1 as there is no such string present.

		// String comparison
		System.out.println(str.equals(str1));// case sensitive

		System.out.println(str.equalsIgnoreCase(str1));// case insensitive

		// substring
		System.out.println(str.substring(0, 9));// excludes char at 9

		String str2 = "  caqh   Project  ";
		System.out.println(str2.trim());// trims before and after space
		System.out.println(str2.replace(" ", ""));// remove between space also

		// split
		String str3 = "CAQH_Project_is_a_fucking_shit";
		String str3val[] = str3.split("_");
		for (int i = 0; i < str3val.length; i++) {
			System.out.println(str3val[i]);
		}

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}

}
