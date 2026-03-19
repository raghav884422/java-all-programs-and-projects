package polymorphismclass2;

import java.util.Scanner;

public class Ractangle extends Shape {
      int length;
      int breath;
	
	void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter length and breath: ");
		length = scan.nextInt();
		breath = scan.nextInt();
		
	}
	void calculateArea() {
		area = length*breath;
		
	}
}
