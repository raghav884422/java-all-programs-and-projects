
public class Squareroot {
	public static void main(String[] args) {
		double number = 25.0;
		double squareRoot = Math.sqrt(number);
		System.out.println("The square root of " + number + " is: " + squareRoot);
		
		double negativeNumber = -9.0;
		double resultNaN = Math.sqrt(negativeNumber);
		System.out.println("The square root of " + negativeNumber + " is: " + resultNaN);
	
	}

}
