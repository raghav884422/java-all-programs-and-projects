package polymorphismclass2;

import java.util.Scanner;

public class Square extends Shape {
      int length;
	void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length of square: ");
		length = scan.nextInt();
	}
	void calculateArea() {
		area = length*length;
	}
}
