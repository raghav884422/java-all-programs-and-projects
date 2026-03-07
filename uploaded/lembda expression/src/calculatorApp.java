
public class calculatorApp {
public static void main(String[] args) {
	calculator add = (a,b) -> a+b;
	calculator sub = (a,b) -> a-b;
	calculator mul = (a,b) -> a*b;
	calculator div = (a,b) -> a/b;
	System.out.println(add.calculate(5, 21));
	System.out.println(sub.calculate(15, 25));
	System.out.println(mul.calculate(5, 15));
	System.out.println(div.calculate(5, 6));
	
}
}
