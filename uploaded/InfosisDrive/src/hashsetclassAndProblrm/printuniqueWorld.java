package hashsetclassAndProblrm;

import java.util.HashSet;
import java.util.Scanner;

public class printuniqueWorld {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<String> hs = new HashSet<String>();
		System.out.println("enter the world String ");
		String words[]= sc.nextLine().toLowerCase().split("\\s+");
		for (String s : words) {
			hs.add(s);
		}
		System.out.println("hashset=> "+hs);
		
	}
}
