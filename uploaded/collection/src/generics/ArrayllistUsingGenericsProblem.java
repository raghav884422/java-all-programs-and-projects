package generics;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayllistUsingGenericsProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		String type = sc.next();
		if(type.equals("Integer")) {
			ArrayList<Integer> al = new ArrayList<Integer>();
			
			for(int i=0;i<=size-1;i++) {
				al.add(sc.nextInt());
			}
			for ( int x : al) {
				System.out.print(x+" ");
			}
			System.out.println(al.get(2));
			
		}
		
		else if(type.equals("String")) {
			ArrayList<String> al = new ArrayList<String>();
			sc.next();
			for(int i=0;i<=size-1;i++) {
				al.add(sc.next());
			}
			for ( String x : al) {
				System.out.print(x+" ");
			}
			}
			else if(type.equals("Double")) {
				ArrayList<Double> al = new ArrayList<Double>();
				sc.next();
				for(int i=0;i<=size-1;i++) {
					al.add(sc.nextDouble());
				}
				for ( double x : al) {
					System.out.print(x+" ");
				}
			
		}
	}

}
