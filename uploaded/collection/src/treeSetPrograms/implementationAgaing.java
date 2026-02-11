package treeSetPrograms;

import java.util.Scanner;
import java.util.TreeSet;

public class implementationAgaing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		TreeSet<String> ts = new TreeSet<String>();
		for (int i = 1; i <= n; i++) {
			String strArr[] = sc.nextLine().split(" ");
			String command = strArr[0];
			switch (command) {
			case "ADD": 
				ts.add(strArr[1]);
				break;
			case "REMOVE": 
				if(ts.isEmpty()) {
					System.out.println("no programming languege");
				}else {
					
					ts.remove(strArr[1]);
				}
				break;
			case "CHECK":
				if(ts.contains(strArr[1])) {
					System.out.println("yes");
				}else {
					System.out.println("No");
				}
			
				break;
			case "FIRST": 
				if(ts.isEmpty()) {
					System.out.println("No Programming languge");
				}else {
					System.out.println(ts.first());
			
				}
				break;
			case "LAST": 
				if(ts.isEmpty()) {
					System.out.println("No Programming languge");
				}else {
					System.out.println(ts.last());
			
				}
				break;
			case "PRINT": 
				if(ts.isEmpty()) {
					System.out.println("No Programming languge");
				}else {
					System.out.println(String.join(" ", ts));
			
				}
				break;
			}
		

		}
	}
}
