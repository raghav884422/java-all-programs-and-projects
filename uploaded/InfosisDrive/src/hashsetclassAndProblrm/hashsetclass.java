package hashsetclassAndProblrm;

import java.util.HashSet;
import java.util.Scanner;

class hashsetclass{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> hs = new HashSet<Integer>();
		int n = sc.nextInt();
		for(int i=0;i<=n-1;i++) {
			hs.add(sc.nextInt());
		}
		System.out.println("hashSet "+hs);
	}
}