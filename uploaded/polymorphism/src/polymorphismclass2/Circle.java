package polymorphismclass2;

import java.util.Scanner;

public class Circle extends Shape {
     int radius;
     
	void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the radius: ");
		radius = scan.nextInt();
	}
	void calculateArea() {
		area =3.141f*radius*radius;
	}

}
