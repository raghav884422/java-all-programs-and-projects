package generics;

import java.util.Scanner;

public class ArrayListBasic {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        // TODO: Read the number of elements (n)
	        int n = sc.nextInt();
	        String type = sc.next();
	        if(type.equals("Integer")) {
	            ArrayList<Integer> al = new ArrayList<>();
	            for(int i = 1;i<=n;i++){
	                al.add(sc.nextInt());
	            }
	            
	                System.out.println("Size: "+n);
	                System.out.print("Elements: ");
	            for(int x:al){
	                System.out.print(x+" ");
	            }
	        }
	        if(type.equals("String")) {
	            ArrayList<String> al = new ArrayList<>();
	            // sc.next();
	            for(int i = 1;i<=n;i++){
	                al.add(sc.next());
	            }
	                System.out.println("Size: "+n);
	                System.out.print("Elements: ");
	            for(String x:al){
	                System.out.print(x+" ");
	            }
	        }
	        if(type.equals("Double")) {
	            ArrayList<Double> al = new ArrayList<>();
	            
	            for(int i = 1;i<=n;i++){
	                al.add(sc.nextDouble());
	            }
	                System.out.println("Size: "+n);
	                System.out.print("Elements: ");
	            for(double x:al){
	                System.out.print(x+" ");
	            }
	        }
	        // TODO: Read the type of elements (type)
	        // TODO: Create a generic ArrayList based on the type
	        // TODO: Read and add elements to the ArrayList
	        // TODO: Print the size of the ArrayList
	        // TODO: Print all elements of the ArrayList
	        sc.close();
	    }
	}

}
