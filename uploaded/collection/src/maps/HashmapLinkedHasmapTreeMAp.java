package maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashmapLinkedHasmapTreeMAp {
public static void main(String[] args) {
	HashMap<Integer, Employee> hm = new HashMap<Integer, Employee>();
	hm.put(100,new Employee(12, "ram", 15000));
	hm.put(75,new Employee(10, "shyam", 25000));
	hm.put(50,new Employee(14, "mohan", 35000));
	System.out.println(hm);
	
	HashMap<Integer, String> hm2 = new HashMap<Integer, String>();
	hm2.put(82, "bhawna");
	hm2.put(46, "aradhya");
	hm2.put(23, "anil");
	System.out.println(hm2);
	
	LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
	lhm.put(46, "aradhya");
	lhm.put(23, "anil");
	lhm.put(82, "bhawna");
	System.out.println(lhm);
	
	TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
	tm.put(46, "aradhya");
	tm.put(23, "anil");
	tm.put(82, "bhawna");  // sorted order of key 
	System.out.println(tm);
}
}
