package Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;

public class hashTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Integer,String> hm = new Hashtable<Integer,String>();
		hm.put(12,"MAHMUD");
		hm.put(11,"SASHI");
		hm.put(10,"GANJI");
		hm.put(9,"BASTAB");
		hm.put(8," " );
		
		
		System.out.println(hm.get(9));
		hm.remove(9);
		System.out.println(hm.get(9));
		
		//Converting hashmap into set
		Set sn = hm.entrySet();
		Iterator  it = sn.iterator();
		
		while(it.hasNext()) {
		Map.Entry mp = (Map.Entry)it.next();
		System.out.println(mp.getKey());
		System.out.println(mp.getValue());	
			
		}	
		
		
	
	}

}
