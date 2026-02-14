package controlContruct;
import java.util.*;
public class ifElseLadder {
	 public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your marks");
		int  a = scan.nextInt();
		int b = a/10;
		

		
		if (b>=6) {
		System.out.println("*****");
	}
		else if(b>=5) {
			System.out.println("*****");
		}
		else if(b>=4) {
			System.out.println("***");
		}
		else if (b>=3) {
			System.out.println("**");
		}
		else {
			System.out.println("*");
			}
		}

}

		