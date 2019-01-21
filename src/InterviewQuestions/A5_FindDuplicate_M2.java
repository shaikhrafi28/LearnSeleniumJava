package InterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class A5_FindDuplicate_M2 {
//HashSet doesnt store duplicates.
	//Time Complexity is O(n)
	public static void main(String[] args) {
		String names[] = { "veeraj", "mahmud", "rafi", "sandy", "sandy", "sashi","veeraj" };
		FindDuplicates(names);
	}

	public static void FindDuplicates(String a[]) {

	Set<String> storeSet = new HashSet<String>();
	
	for(String a1:a) {
		if(storeSet.add(a1)==false) {
			System.out.println("Duplicate is " + a1);
		}
	}

	}
}
