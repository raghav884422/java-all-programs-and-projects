	package primeNumber;

import java.util.Scanner;

class primeNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		if(number== 1) {
			System.out.println("prime");

		}
			else {
				for(int i =2;i<=number;i++) {
					if(number%i==0&& number<i) {
						System.out.println(number+" is not  prime");
						return;
				}
			}
				System.out.println( number+"is a  prime number");
		}
		scan.close();
	}
	
}