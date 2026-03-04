package interfaceConclusion;

import java.util.Scanner;

public class Ractangle implements Shape {
	private float length;
	private float breath;
	private float area;

	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getBreath() {
		return breath;
	}
	public void setBreath(float breath) {
		this.breath = breath;
	}
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	@Override
	public void acceptInput() {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter length and breath of ractangle");
		length= sc.nextFloat();
		breath = sc.nextFloat();
		
	}
	@Override
	public void claculateArea() {
		// TODO Auto-generated method stub
		area = length*breath;
		
	}
	@Override
	public void displayArea() {
		// TODO Auto-generated method stub
		System.out.print("area of ractangle is " + area);
		
	}
	
}
