package collectionsMathods;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Scanner;
	public class problem1 {

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        ArrayList<String> cities = new ArrayList<>();
	        // TODO: Collect 5 city names from the user

	        for(int i=1;i<=5;i++){
	            cities.add(sc.nextLine());
	        }
	        Collections.reverse(cities);
	        // TODO: Reverse the order of the cities
	     
	        System.out.print("[");
	        for(int i=1;i<=5;i++){
	        
	        System.out.print(cities.get);
	        if(i!=al.size()-1){
	        System.out.print(", ");
	        }
	        }
	        System.out.print("]");
	    
	       

	        // TODO: Print the reversed list

	        sc.close();
	    }
	}

}
