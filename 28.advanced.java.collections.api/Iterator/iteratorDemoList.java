package Iterator;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iteratorDemoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

List<String> al = new ArrayList<String>();
		
		al.add("VEERAJ");
		al.add("MAHMUD");
		al.add("SUBHAM");
		al.add("DJ");
		al.add("SASHI");
		
		
		Iterator<String> i = al.iterator();
		
		//System.out.println(i.next());
	//	System.out.println(i.next());
		
		while (i.hasNext()) {
			System.out.println(i.next());	//ORDERED
		}
	}

}
