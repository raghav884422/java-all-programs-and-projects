package loop;
import java.util.Scanner;

public class factorialInput {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int M = sc.nextInt();
	int N =sc.nextInt();
	int fac1 =1;
	int fac2 = 1;
	int a =1;
	int b=1;
	do {
		fac1*=a;
		a++;
	} while (a<=N);
	do {
		fac2*=b;
		b++;
	} while (b<=M);
	System.out.println(fac1);
	System.out.println(fac2);
}


}
