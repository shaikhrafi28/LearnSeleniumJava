package Iterator;

import java.util.HashSet;
import java.util.Iterator;

public class iteratorDemoSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs = new HashSet<String>();
		
		hs.add("VEERAJ");
		hs.add("MAHMUD");
		hs.add("SUBHAM");
		hs.add("DJ");
		hs.add("SASHI");
		
		
		
		Iterator<String> i = hs.iterator();
		
		//System.out.println(i.next());
		//System.out.println(i.next());
		
		while (i.hasNext()) {
			System.out.println(i.next());	//UNORDERED
		}
		
	}

}
