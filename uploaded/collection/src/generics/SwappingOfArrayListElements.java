package generics;

import java.util.Scanner;

public class SwappingOfArrayListElements {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        // TODO: Read the number of colors (n)
	        int n =sc.nextInt();
	        ArrayList<String> al = new ArrayList<>();
	        for(int i = 1;i<=n;i++) {
	          al.add(sc.next());
	        }
	        System.out.println("Array list before Swap: ");
	        for(String x : al){
	            System.out.println(x);
	        }
	        // for(int i =1,j=2;i<j;i++,j++) {
	        //     Object temp = al.et(i);
	        //     al.set(i)=al.set(j);
	        //     al.set(j)=temp;
	        // }
	        Collections.swap(al,0,2);
	       
	        System.out.println("Array list after Swap: ");
	        for(String x : al){
	            System.out.println(x);
	        }
	        // TODO: Create an ArrayList to store color b names
	        // TODO: Read and add n color names to the ArrayList
	        // TODO: Print the list before swapping
	        // TODO: Swap the first and third elements if possible
	        // TODO: Print the list after swapping
	        sc.close();
	    }
	}
}
