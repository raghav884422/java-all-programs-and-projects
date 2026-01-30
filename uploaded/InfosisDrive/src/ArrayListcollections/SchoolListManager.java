package ArrayListcollections;

import java.util.*;


public class SchoolListManager {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list= new ArrayList<String>();
		int n = sc.nextInt();
		sc.nextLine();
		for(int i =0;i<=n-1;i++) {
			list.add(sc.nextLine());
		}
		list.size();
		System.out.println(list);
		int m = sc.nextInt();
		sc.nextLine();
		for(int i =0;i<=m-1;i++) {
			list.remove(sc.nextLine());
		}
		System.out.println(list);
	}

}
