import java.util.Scanner;

public class ultimateAreaCalculator {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String op = sc.next();
	if (op.equals("rectangle")) {
		double a = sc.nextDouble();
	double b= sc.nextDouble();
	System.out.println("area of Ractangle: "+AreaCalculator.areaRec(a,b));
	
	}
	else if (op.equals("circle")) {
	double r = sc.nextDouble();
	System.out.println("area of circle: "+AreaCalculator.areaCir(r));
}
	else {
		System.out.println("invailid");
	}
	
//	switch (op) {
//	case "Rectangle": 
//		double a = sc.nextDouble();
//		double b= sc.nextDouble();
//		System.out.println("area of Ractangle: "+AreaCalculator.areaRec(a,b));
//	break;
//	case "circle": 
//		double r = sc.nextDouble();
//		System.out.println("area of circle: "+AreaCalculator.areaCir(r));
//	break;
//		
//		
//	}
	
}

class AreaCalculator{
	public static double areaCir(double r) {
	//	double area = 3.14*r*r;
		double area = Math.PI*r*r;
		return area;
	}
	public static double areaRec(double a,double b) {
		double area = a*b;
		return area;
	}
}}