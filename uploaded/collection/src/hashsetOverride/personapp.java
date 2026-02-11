package hashsetOverride;

import java.util.HashSet;
import java.util.Scanner;

public class personapp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashSet<Person> hs = new HashSet<Person>();
		for(int i = 1;i<=n;i++) {
			String name = sc.next();
			int age = sc.nextInt();
			Person p = new Person(name, age);
			hs.add(p);
		}
		System.out.println(hs);
	}

}
