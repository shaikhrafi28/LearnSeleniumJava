package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class A05_FindDuplicate_M3 {
//HashSet doesnt store duplicates.
	public static void main(String[] args) {
		String names[] = { "veeraj", "mahmud", "rafi", "sandy", "sandy", "sashi", "veeraj" };
		FindDuplicates(names);
	}

	public static void FindDuplicates(String a[]) {

		Map<String, Integer> storeMap = new HashMap<String, Integer>();

		for (String a1 : a) {
			Integer count = storeMap.get(a1);
			if (count == null) {
				storeMap.put(a1, 1);
			} else {
				storeMap.put(a1, ++count);
			}
		}
//Get the values from the HashMap
       Set<Entry<String, Integer>> entrySet = storeMap.entrySet();
       for(Entry<String, Integer> entry: entrySet) {
    	   if(entry.getValue()>1) {
    		   System.out.println("Duplicate is " + entry.getKey());
    	   }
       }
	}
}
