package collections;

import java.util.Scanner;

public class Arrayapp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Array a = new Array(scan.nextInt());
		a.insert(55, 0);
		a.display();
		a.insertAll(50);
		a.display();
		System.out.println(a.search(50));
	a.delete(0);
	a.display();
		System.out.println();

	}

}
