package ArrayDequeueClassPRoble;

import java.util.*;
public class CheckBalance {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String expr = sc.nextLine();
	        System.out.println(checkBalanced(expr));
	    }

	    public static String checkBalanced(String expr) {
	        // Your code here
	        ArrayDeque<String> ad = new ArrayDeque<String>();
	        ad.add(expr);
	        
	        for(Object x: ad) {
	            
	                   return "Balanced";
	            }else{

	        return "Not Balanced";
	            }
	        }
	    }
	}

}
