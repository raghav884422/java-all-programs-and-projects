package hashSet;

import java.util.HashSet;
import java.util.Scanner;

public class HashicodebasicProgram {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	HashSet<Integer> hs = new HashSet<Integer>();
	hs.add(100);
	hs.add(25);
	hs.add(50);
	hs.add(75);
	hs.add(125);
	hs.add(150);
	hs.add(175);
	System.out.println(hs);
}
}
