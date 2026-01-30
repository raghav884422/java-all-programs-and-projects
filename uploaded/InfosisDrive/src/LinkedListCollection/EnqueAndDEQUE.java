package LinkedListCollection;

import java.util.*;
public class EnqueAndDEQUE {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        sc.nextLine(); // consume newline
	        String[] ops = new String[N];
	        for (int i = 0; i < N; i++) {
	            ops[i] = sc.nextLine();
	        }
	        System.out.println(bankQueue(ops));
	    }

	    public static String bankQueue(String[] ops) {
	        // Your code here
	    	LinkedList<String> queue = new LinkedList<String>();
	    	for (int i =0;i<=ops.length-1;i++) {
	    		String op = ops[i];
				if(op.startsWith("ENQUEUE")) {
	                 String arr[] = op.split(" ");
	                 queue.addLast(arr[1]);
				}
				else if(op.startsWith("DEQUEUE")) {
					if(queue.isEmpty()==false) {
						
						queue.removeFirst();
					}
			}
	    	
	        
	    	}
	    	if(queue.isEmpty()) {
	    		return "empty";
	    	}
	    	else {
	    		
	    		return String.join(" " , queue);
	    	}
	}

}
