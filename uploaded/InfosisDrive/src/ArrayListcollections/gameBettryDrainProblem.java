package ArrayListcollections;
import java.util.*;

public class gameBettryDrainProblem {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int B = sc.nextInt(); // bettery capacity
	        int n = sc.nextInt();  // number of moves
	        int[] C = new int[n];
	        for (int i = 0; i < n; i++) C[i] = sc.nextInt();
	        System.out.println(minPowerMoves(B, C));
	    }

	    public static String minPowerMoves(int B, int[] C) {
	        // Your code here
	    	ArrayList<Integer> al = new ArrayList<Integer>();
	    	for(int i =0;i<=C.length-1;i++) {
	    		al.add(C[i]+C[i]);
	    }
	    	int sum =0;
	    	for (Integer x : al) {
				sum +=x;
			}
	    	if(B<sum) {
	    		return "Possible";
	    	}
	    	else {
	    		return "Can not reach zero";
	    	}
	}

}
