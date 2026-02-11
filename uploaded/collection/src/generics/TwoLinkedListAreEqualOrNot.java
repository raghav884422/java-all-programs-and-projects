package generics;

import java.util.LinkedList;
import java.util.Scanner;

public class TwoLinkedListAreEqualOrNot {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	LinkedList<Integer> ll = new LinkedList<Integer>();
	for(int i = 1;i<=n;i++) {
		ll.add(sc.nextInt());
	}
	int n2 = sc.nextInt();
	LinkedList<Integer> ll2 = new LinkedList<Integer>();
	for(int i = 1;i<=n;i++) {
		ll2.add(sc.nextInt());
	}
	if(ll.equals(ll2)) {
		System.out.println("identical");
	}
	else {
		System.out.println("not identical");
	}
	
}
}
