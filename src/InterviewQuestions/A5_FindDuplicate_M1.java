package InterviewQuestions;

public class A5_FindDuplicate_M1 {

	public static void main(String[] args) {
		String names[] = { "veeraj", "mahmud", "rafi", "sandy", "mahmud", "sashi","veeraj" };
		FindDuplicates(names);
	}

	public static void FindDuplicates(String a[]) {

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i].equals(a[j])) {
					System.out.println("Duplicate is " + a[i]);
				}

			}
		}

	}
}
