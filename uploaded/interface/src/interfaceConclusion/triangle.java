package interfaceConclusion;

import java.util.Scanner;

public class triangle implements Shape{
	private float  area;
	private float base;
	private float height;
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	public float getBase() {
		return base;
	}
	public void setBase(float base) {
		this.base = base;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	@Override
	public void acceptInput() {
		Scanner sc = new Scanner(System.in);
    System.out.println("enter the base and hight of trinagle");
		base = sc.nextFloat();
		height = sc.nextFloat();
		
	}
	@Override
	public void claculateArea() {
	
		area = 1/2*base*height;
		
	}
	@Override
	public void displayArea() {
		System.out.println("area of triangle is "+ area);
		
	}
	
	

}
