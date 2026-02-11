package maps;

import java.util.HashMap;
import java.util.Scanner;

public class EmployeeManagmentHashset {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	HashMap<Integer, String> hm  = new HashMap<Integer, String>();
	for(int i = 1;i<=n;i++) {
		int id =sc.nextInt();
		String name = sc.next();
		hm.put(id, name);
	}
	System.out.println(hm);
	int showIndex=sc.nextInt();
	int removeIndex = sc.nextInt();
	
	System.out.println(hm.get(showIndex));
	hm.remove(removeIndex);
	System.out.println(hm);
	
}
}
