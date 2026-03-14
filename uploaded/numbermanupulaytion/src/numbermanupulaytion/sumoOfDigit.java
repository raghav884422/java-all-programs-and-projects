package numbermanupulaytion;

import java.util.Scanner;

public class sumoOfDigit {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int number=sc.nextInt();
	sumt s1 =new sumt();
	s1.sumDigit(number);
	
}
}
class sumt{
	public void sumDigit(int number) {
		int sum =0;
		while (number>0) {
			int temp = number%10;
			sum=sum+temp;
			number=number/10;
			
		}
		System.out.println(sum);
	}
}
