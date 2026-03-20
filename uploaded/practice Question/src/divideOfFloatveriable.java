import java.util.Scanner;

public class divideOfFloatveriable {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
     double a = sc.nextDouble();
     double b = sc.nextDouble();
     divide d = new divide();
     d.div(a, b);
}
	
}
class divide{
	public void div(double m, double n) {
		if(n!=0) {
			double res = m/n;
			System.out.println(res);
	    }
		else {
		System.out.println("invailid user");
	}
		}
}
