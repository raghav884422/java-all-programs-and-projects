package interfaceConclusion;

import java.util.Scanner;

public class square implements Shape {
	private float side;
	private float area;
	public float getSide() {
		return side;
	}
	public void setSide(float side) {
		this.side = side;
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
		side = sc.nextFloat();
		
		
	}
	@Override
	public void claculateArea() {
		area= side*side;
		
	}
	@Override
	public void displayArea() {
		// TODO Auto-generated method stub
		System.out.println("the area of square is "+ area);
		
	}
	

}
