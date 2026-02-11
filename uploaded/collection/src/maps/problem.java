package maps;

public class problem {
	import java.util.Map;
import java.util.Scanner;
	import java.util.TreeMap;

	public class Main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // TODO: Create a TreeMap to store flight schedules
	        int n = sc.nextInt();
	        TreeMap<String,String> tm = new TreeMap<>();
	        for(int i =1;i<=n;i++) {
	           String name = sc.next();
	           String time = sc.next();
	           tm.put(name,time);
	           System.out.println("Added: "+name +" at "+time);
	        }
	        String searchTime = sc.next();
	        if(tm.containsKey(searchTime)==true) {
	           System.out.println("Flight at "+searchTime+": "+tm.get(searchTime));
	            
	        }
	        else{
	            System.out.println("No flight found at "+searchTime);
	        }
	        String removeTime = sc.next();
	        if(tm.containsKey(removeTime)==true) {
	           System.out.println("Flight removed: "+tm.get(removeTime)+" at "+removeTime);
	            
	        }
	        else{
	            System.out.println("No flight found at "+searchTime);
	        }
	        for(Map.Entry<String,String> e : tm.entrySet()) {
	            System.out.println(e.getValue()+" -> "+e.getKey());
	        }
	        // TODO: Add flight schedules from input
	        // TODO: Retrieve flight details based on arrival time
	        // TODO: Remove flight schedule using arrival time
	        // TODO: Print all flight schedules in chronological order

	        sc.close();
	    }
	}
}
