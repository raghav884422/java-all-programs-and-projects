package loop;
import java.util.*;
public class factoralInput {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a = scan.nextInt();
		
		double fact1 = 1;
		

		do {
			fact1 *= a;
			
			a--;
			
			
		}while (a>0);
		System.out.println(fact1);
		
		
		double b = scan.nextInt();
		double fact2 = 1;
		do {
			fact2 *= b;
			
			b--;
			
			
		}while (b>0);
		System.out.println(fact2);
		
	}

}
