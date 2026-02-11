package ArrayDequeue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ArrayDewueImplementation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
      for(int i =1;i<=n;i++) {
    	  ad.add(sc.nextInt());
      }
      int addFirst = sc.nextInt();
      int addLast = sc.nextInt();
      ad.addFirst(addFirst);
      ad.addLast(addLast);
      ad.removeFirst();
      ad.removeFirst();
      System.out.println(ad);
	}
}
