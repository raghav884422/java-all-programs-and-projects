package interfaceConclusion;

import java.util.Scanner;

final public class cylinder implements Shape {
	private float area;
	private float radius;
	private float height;
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	@Override
	public void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the radius and height ");
		radius = scan.nextFloat();
		area=scan.nextFloat();
		
	}
	@Override
	public void claculateArea() {
		// TODO Auto-generated method stub
		area = (2*PI*radius*radius)+(2*PI*radius*height);
		
	}
	@Override
	public void displayArea() {
		System.out.println("area of cylibnder is "+ area);
		
	}
	

}
