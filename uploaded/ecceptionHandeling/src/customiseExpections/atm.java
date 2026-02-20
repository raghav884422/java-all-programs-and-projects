package customiseExpections;

import java.util.Scanner;

public class atm {
	int un = 1111;
	int pass = 2222;
	int eun;
	int epass;
	
	void takeInput()  {
		Scanner sc = new Scanner(System.in);
		eun = sc.nextInt();
		epass =sc.nextInt();
	}
	void validate() throws invalidUsernamePAssWord {
		if(eun==un&&pass==epass) {
			System.out.println("PassWorld validated...take your money");
		}
		else {
			invalidUsernamePAssWord iup = new invalidUsernamePAssWord();
			System.out.println(iup.getMessage());
			throw iup;
		}
	}
}
