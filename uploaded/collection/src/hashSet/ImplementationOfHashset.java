package hashSet;

import java.util.HashSet;
import java.util.Scanner;

public class ImplementationOfHashset {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	HashSet<Integer> hs = new HashSet<Integer>();
	for(int i =1;i<=n;i++) {
		hs.add(sc.nextInt());
	}
	while(true) {
		 	String s = sc.next();
		 	if(s.equalsIgnoreCase("ADD")) {
		 		hs.add(sc.nextInt());
		 		System.out.println(hs);
		 	}
		 	else if(s.equalsIgnoreCase("REMOVE")) {
		 		if(!hs.isEmpty()) {
		 			hs.remove(sc.nextInt());
		 			System.out.println(hs);
		 		}
		 	}
		 	else if(s.equalsIgnoreCase("CHECK")) {
		 		if(hs.contains(sc.nextInt())) {
		 			System.out.println("YES");
		 		}
		 		else {
		 			System.out.println("NO");
		 		}
		 	}
		 	else if(s.equalsIgnoreCase("PRINT")) {
		 		System.out.println(hs);
		 	}
		 	else if(s.equalsIgnoreCase("STOP")) {
		 		break;
		 	}
		 	
	}
}
}
