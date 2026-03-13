package numberManupulation;

import java.util.Scanner;


public class cubeRange {	    // Method to print cube natural numbers up to a given limit
    public void printCubes(int n) {
        System.out.println("Cube natural numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            long cube = (long) i * i * i; // Use long to prevent overflow for larger 'n'
            System.out.println("Number: " + i + ", Cube: " + cube);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number (n): ");
        int limit = scanner.nextInt();

        // Create an instance of the CubeNumbers class
        cubeRange cubeGenerator = new cubeRange();

        // Call the printCubes method to display the results
        cubeGenerator.printCubes(limit);

        scanner.close();
    }

}
