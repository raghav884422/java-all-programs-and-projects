package singleThread;

import java.util.Scanner;

public class SinglethreadProgramOfThreeTasks {
	public static void main(String[] args) {
     System.out.println("main mathod exicution started");
     System.out.println("bank activity start exicuitng");
     Scanner sc = new Scanner(System.in);
     int pass = 1234;
     int upass = sc.nextInt();
     if(pass==upass) {
    	 System.out.println("Access your account");
     }
     else {
    	 System.out.println("password wrong access denied");
     }
     System.out.println("bank activity exicuition ended");
     
     System.out.println("Printing activity started");
     for(int i =1;i<=10;i++) {
    	 System.out.println("Raghav");
     }
     System.out.println("Printing activity ended");
     
     System.out.println("Addition mathod started");
     int a =10;
     int b =20;
     System.out.println("Result is : "+a+b);
     System.out.println("Addition mathod ended");
     
     System.out.println("main mathod exicution started");
     
	}
}
