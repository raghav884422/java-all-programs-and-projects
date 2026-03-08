package loop;
import java.util.*;
public class sumOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();	
do {
	System.out.println("1 add");
	System.out.println("2 sub");
	System.out.println("3 mul");
	System.out.println("4 divide");
	System.out.println("5 exit");
	
	System.out.println("enter the two value: ");
	int b1 = sc.nextInt();
	int b2 = sc.nextInt();
	
	if (a==1) {
		System.out.println(b1+b2);
		
	}
	if (a==2) {
		System.out.println(b1-b2);
		
	}if (a==1) {
		System.out.println(b1*b2);
		
	} if (a==1) {
		System.out.println(b1/b2);
		
	}
}while(a!=5);
sc.close();
}
}
