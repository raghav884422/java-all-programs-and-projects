
public class unsighnedRightshift {
public static void main(String [] args) {

	        int a = -20; 
	        int result1 = a >> 2; 
	        int result2 = a >>> 2;

	        System.out.println("Original Number: " + a);
	        System.out.println("Signed Right Shift (>>): " + result1);
	        System.out.println("Unsigned Right Shift (>>>): " + result2);
	    }
}
