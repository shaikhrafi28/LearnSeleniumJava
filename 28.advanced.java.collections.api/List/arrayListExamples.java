package List;

import java.util.ArrayList;

public class arrayListExamples {
//can accept duplicate values
	// Arraylist, linkedlist, vector, implementing list interface
	// array have fixed size whereas arraylist grow dynamically
	// we can insert and access any values in any index
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("Rahul");
		a.add("java");
		System.out.println(a);
		
		a.add(0, "student");
		System.out.println(a);
		
		/*a.remove(1);
		a.remove("java");
		System.out.println(a);*/
		
		System.out.println(a.get(2));
		
		System.out.println(a.contains("testing"));
		
		System.out.println(a.contains("java"));
		
		System.out.println(a.indexOf("rahul"));
		
		System.out.println(a.isEmpty());
		
		System.out.println(a.size());
		
		
	}

}
