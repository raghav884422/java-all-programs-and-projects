package generics;

import java.util.ArrayList;

public class Arraylistgenerics {
	public static void main(String[] args) {
      ArrayList<Integer> al = new ArrayList<Integer>();
      al.add(215);
      al.add(21);
//      al.add("raghav mishra "); //error 
//      al.add(215.123156);   //error 
//      al.add(256.45);   //error 
//      al.add(true);    //error 
      System.out.println(al);
      
      
      
	}
}
