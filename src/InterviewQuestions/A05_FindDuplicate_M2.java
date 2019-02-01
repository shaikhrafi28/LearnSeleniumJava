package InterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class A05_FindDuplicate_M2 {
//HashSet doesnt store duplicates.
	// Time Complexity is O(n)
	
	public static void main(String[] args) {
		String names[] = { "veeraj", "mahmud", "rafi", "sandy", "sandy", "sashi", "veeraj" };
		FindDuplicates(names);
	}

	public static void FindDuplicates(String a[]) {

		Set<String> storeSet = new HashSet<String>();
		/*
		 * For(<DataType of array/List><Temp variable name> : <Array/List to be
		 * iterated>){ System.out.println(); //Any other operation can be done with this
		 * temp variable. }
		 * 
		 */
		for (String a1 : a) {
			if (storeSet.add(a1) == false) {
				System.out.println("Duplicate is " + a1);
			}
		}

	}
}
