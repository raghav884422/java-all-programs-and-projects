package matrimonialCustomException;

import java.util.Scanner;



public class Applicant {
	int age;
	void takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age of applicant");
		age = sc.nextInt();
	}
	void validate()throws lessAgeException,moreAgeexception {
		if(age>21&&age<40) {
			System.out.println("you marrid application is accepted.");
		}
		else {
			if(age<21) {
				lessAgeException la = new lessAgeException();
				System.out.println(la.getMessage());
				la.printStackTrace();
				throw la;
			}
			if(age>40) {
				moreAgeexception ma = new moreAgeexception();
				System.out.println(ma.getMessage());
				ma.printStackTrace();
				throw ma;
			}
		}
	}

}
