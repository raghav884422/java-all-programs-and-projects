package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
public class problem1 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // TODO: Read the number of integers (n)
	        int n = sc.nextInt();
	        // TODO: Create an ArrayList to store the integers
	        ArrayList<Integer> al = new ArrayList<>();
	        for(int i =1;i<=n;i++){
	            al.add(sc.nextInt());
	        }
	        Collections.sort(al,new decendingOrder());
	        // Collections.reverse(al);
	        System.out.println(al);


	        // TODO: Add integers to the ArrayList
	        // TODO: Sort the list using a custom Comparator

	        sc.close();
	    }
	}
class decendingOrder implements Comparator<Integer>{
	public int compare(Integer a,Integer b){
		if(a>b){
			return -1;
		}
		if(a<b){
			return 1;
		}else {
			return 0;
		}
	}
}


