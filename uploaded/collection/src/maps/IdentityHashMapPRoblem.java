package maps;

import java.util.IdentityHashMap;
import java.util.WeakHashMap;

public class IdentityHashMapPRoblem {
public static void main(String[] args) {
    String s1 = new String("A");
    String s2 = new String("A");
    String s3 = new String("A");
    String s4 = new String("A");
   IdentityHashMap<String, Integer> whm = new IdentityHashMap<>();
	whm.put(s1, 1000);
	whm.put(s2, 2000);
	whm.put(s3, 3000);
	whm.put(s4, 4000);

	System.out.println(whm);
whm.ge
	
// address diffrent value same
}
}
