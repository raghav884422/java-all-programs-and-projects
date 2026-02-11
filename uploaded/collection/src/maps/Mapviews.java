package maps;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Mapviews {
public static void main(String[] args) {
	HashMap<Integer,String> hm = new HashMap<Integer, String>();
	hm.put(100, "ram");
	hm.put(102, "shyam");
	hm.put(103, "mohan");
	hm.put(104, "sohan");
	hm.put(105, "seeta");
	System.out.println(hm);
	
	Set<Integer> keys =hm.keySet();
	Iterator<Integer> itr = keys.iterator();
	while(itr.hasNext()) {
		
		System.out.print(itr.next()+" ");
	}
	System.out.println();
	
	Collection<String> values = hm.values();
	Iterator<String> itr2 = values.iterator();
	while(itr2.hasNext()) {
		
		System.out.print(itr2.next()+" ");
	}
	System.out.println();
	
	Set keyvalue = hm.entrySet();
	Iterator itr3 = keyvalue.iterator();
	while(itr3.hasNext()) {
		
		System.out.println(itr3.next()+" ");
	}
	
	
}
}
