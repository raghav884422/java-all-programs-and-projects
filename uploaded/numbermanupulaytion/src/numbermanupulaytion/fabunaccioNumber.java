package numbermanupulaytion;

import java.util.Scanner;

public class fabunaccioNumber {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("ener no");
		int n = scan.nextInt();
		fabo f1 =new fabo();
		
		f1.series(n);
		
	}

}
 class fabo{
	 public static void series(int n){
		 int fab1=0;
		 int fab2=1;    
		 if(n==1) {
			 System.out.println(fab1);
		 }
		 if(n==2) {
			 System.out.println(fab1);
			 System.out.println(fab2);
		 }
		 else {
			 System.out.println(fab1);
			 System.out.println(fab2);
			 for(int i=3;i<=n;i++) {
				 int nextNo =fab1+fab2;
				 System.out.println(nextNo);
				 fab1=fab2;
				fab2=nextNo;
				 
			 }
		 }
		 
	 }
 }
