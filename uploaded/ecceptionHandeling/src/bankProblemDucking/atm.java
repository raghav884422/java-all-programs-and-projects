package bankProblemDucking;

import java.util.Scanner;

public class atm {

	 void validate() throws Exception{
		 System.out.println("Connection to DB established");
		 Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter username and password:");
		 int username = sc.nextInt();
		 int pass = sc.nextInt();
        double v = username/pass;
        System.out.println("validated take money");
		}
		
		finally {
			
			System.out.println("Connection to DB terminated");
		}
	}
}
