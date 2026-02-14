package controlContruct;

import java.util.Scanner;

public class javaSwitch {
	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		int a = m.nextInt();
		int b = a/10;
		
		switch (a) {
		case 6,7,8,9 ->
		System.out.println("*****");
		case 5 ->
		System.out.println("****");
		case 4->
		System.out.println("**");
	
		default->
			System.out.println("*");
		}	
		}
	}
