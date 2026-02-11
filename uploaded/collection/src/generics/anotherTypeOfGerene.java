package generics;

import java.util.ArrayList;
import java.util.Scanner;

public class anotherTypeOfGerene {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		 String type = scan.next();
		 switch (type) {
		case "Integer" -> { 
			ArrayList<Integer> al = new ArrayList<Integer>();
			for(int i=1;i<=n;i++) {
				al.add(scan.nextInt());
			}
			 for (Object x: al) {
					System.out.print(x);
				}
		}
		case "String" -> {
			ArrayList<String> al = new ArrayList<String>();
			for(int i=1;i<=n;i++) {
				al.add(scan.next());
			}
			 for (Object x: al) {
					System.out.print(x);
				}
		
		}
		case "Double" -> {
			ArrayList<Double> al = new ArrayList<Double>();
			for(int i=1;i<=n;i++) {
				al.add(scan.nextDouble());
			}
			 for (Object x: al) {
					System.out.print(x+" ");
				}
		
		}
		default->
			System.out.println("Unexpected value: " + type);
		}
	
	}

}
