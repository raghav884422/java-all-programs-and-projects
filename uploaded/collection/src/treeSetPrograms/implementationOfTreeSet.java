package treeSetPrograms;

import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;
import java.util.TreeSet;

public class implementationOfTreeSet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		TreeSet<String> ts = new TreeSet<String>();

		for (int i = 0; i <= n; i++) {
			String strArr[] = sc.nextLine().split(" ");
			switch (strArr[0]) {
			case "ADD":
				ts.add(strArr[1]);
				break;
			case "REMOVE":
				ts.remove(strArr[1]);
				break;
			case "CHECK":
				if (ts.contains(strArr[1])) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
				break;
			case "FIRST":
				if (ts.isEmpty()) {
					System.out.println("NO programming languege ");
				} else {
					System.out.println(ts.first());
				}
				break;

			case "LAST":
				if (ts.isEmpty()) {
					System.out.println("NO programming languege ");
				} else {
					System.out.println(ts.last());
				}
				break;
			case "PRINT":
				if (ts.isEmpty()) {
					System.out.println("NO programming languege ");
				} else {
					System.out.println(String.join(" ", ts));
				}
				

			}

		}
	}
}
