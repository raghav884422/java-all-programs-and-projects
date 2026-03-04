package interfaceConclusion;

import java.util.Scanner;

final public class Circle implements Shape {
	private float radius;
	private float area;
	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	@Override
	public void acceptInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter radius: ");
          radius = sc.nextFloat();		
	}
	@Override
	public void claculateArea() {
		area = PI*radius*radius;
		
	}
	@Override
	public void displayArea() {
	System.out.println("Area of circle radius "+radius + " is "+ area);
		
	}

}
