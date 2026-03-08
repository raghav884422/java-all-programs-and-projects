package loop;

import java.util.Iterator;
import java.util.Scanner;


public class factorialOfNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int factorial =1;
	 do{
		factorial *= number;
		number--;
		
	    }while (number>0);
	System.out.println("factorial of  "+ factorial);
	}

}
