package numbermanupulaytion;

import java.util.Scanner;

public class nthNoFab {
	public static int findNthFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer.");
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        int a = 0; // Represents F(i-2)
        int b = 1; // Represents F(i-1)
        int result = 0; // Represents F(i)

        for (int i = 2; i <= n; i++) {
            result = a + b;
            a = b;
            b = result;
            
        }
        return result;
    }

    public static void main(String[] args) {
    	Scanner sv = new Scanner(System.in);
        int n = sv.nextInt(); // Example: Find the 10th Fibonacci number
        int fibNumber = findNthFibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is: " + fibNumber);
    }
}


