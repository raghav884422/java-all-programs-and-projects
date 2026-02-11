package generics;

import java.util.ArrayList;
import java.util.Scanner;
public class AddingElemnetAtFirstAndLast {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        // TODO: Read the number of elements (n)
	        int n = sc.nextInt();
	        ArrayList<Integer> al = new ArrayList<>();
	        for(int i =1;i<=n;i++) {
	            al.add(sc.nextInt());
	        }
	        int number = sc.nextInt();
	        al.addFirst(number);
	        System.out.println("Updated ArrayList: ");
	        for(int x:al){
	            System.out.print(x+" ");
	        }
	        // TODO: Create an ArrayList to store integers
	        // TODO: Read and add n integers to the ArrayList
	        // TODO: Read the element to insert
	        // TODO: Insert the element at the first position
	        // TODO: Print the updated ArrayList
	        sc.close();
	    }
	}
}
