import java.util.Scanner;

public class digitsum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		int b = (int)a;
		sumdigit s = new sumdigit();
		s.sum(b);
		
	}

}
class sumdigit{
	int sum=0;
	public void sum(int m){
		while(m>0){
			int n=m%10;
		 sum = sum+n;
		   m=m/10;
		 }
		 System.out.print(sum);
		
	}
}