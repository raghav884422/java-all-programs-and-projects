package controlContruct;

import java.util.*;
public class ternaryOperator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String op = sc.next();
        
		switch(op) {
		case "plus"->{
		int a = sc.nextInt();
		int b= sc.nextInt();
		Integer sum= a+b;
		
		int  x=(sum>0)?sum :0;
		System.out.println(x);
		}
		
		case "minus"->{
			int a = sc.nextInt();
			int b= sc.nextInt();
			Integer sub= a-b;
			
			if(a>0&&b>0) {
			int  m=(sub>0)?sub :0;
			System.out.println(m);
			}
			else {
				System.out.println("invaild input");
			}
			}
		}
	}

}
