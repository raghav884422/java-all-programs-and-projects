package generics;

import java.util.Scanner;

public class mergingTwoArrayList {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        // TODO: Read the number of colors for the first list (n1)
	        int n = sc.nextInt();
	        ArrayList<String> al = new ArrayList<>();
	        for(int i =1;i<=n;i++) {
	            al.add(sc.next());
	        }
	        System.out.print("List of first array: ");
	        for(String x:al){
	            System.out.print(x+" ");
	        }
	        System.out.println();
	        
	        int n2 = sc.nextInt();
	        ArrayList<String> al2 = new ArrayList<>();
	        for(int i =1;i<=n2;i++) {
	            al2.add(sc.next());
	        }
	        System.out.print("List of second array: ");
	        for(String x:al2){
	            System.out.print(x+" ");
	        }
	        System.out.println();
	        al.addAll(al2);
	        System.out.print("New array: ");
	        for(String x:al){
	            System.out.print(x+" ");
	        }
	        

	        // TODO: Create an ArrayList to store first list of colors
	        // TODO: Read and add n1 colors to the first ArrayList
	        // TODO: Read the number of colors for the second list (n2)
	        // TODO: Create an ArrayList to store second list of colors
	        // TODO: Read and add n2 colors to the second ArrayList
	        // TODO: Merge both ArrayLists into a new ArrayList
	        // TODO: Print all three lists as per the output format
	        sc.close();
	    }
	}
	

}
