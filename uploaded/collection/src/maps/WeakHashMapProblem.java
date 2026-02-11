package maps;

import java.util.WeakHashMap;

public class WeakHashMapProblem {
public static void main(String[] args) {
      String s1 = new String("A");
      String s2 = new String("B");
      String s3 = new String("C");
      String s4 = new String("D");
     WeakHashMap<String, Integer> whm = new WeakHashMap<>();
	whm.put(s1, 1000);
	whm.put(s2, 2000);
	whm.put(s3, 3000);
	whm.put(s4, 4000);
	whm.put(new String("Z"), 9991);
	System.out.println(whm);
	System.gc();
	for(int i=0;i<=99999;i++) {
		System.out.print("");
	}
	System.out.println();
	System.out.println(whm);
//	the key value is remove by garbage collector if it is not use in program again and again
}
}
