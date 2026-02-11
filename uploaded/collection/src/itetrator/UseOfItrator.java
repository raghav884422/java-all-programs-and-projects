package itetrator;

import java.util.ArrayList;
import java.util.Iterator;

class UseOfItrator{
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100); // al.add(new Integer(100)); //BOXING // AUTOBOXING
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add(175);
		System.out.println(al);
		System.out.print("[");
		for(int i = 0;i<=al.size()-1;i++) {
			System.out.print(al.get(i));
			if(i!=al.size()-1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
		System.out.print("[");
		int count=0;
		for(Object x: al) {
			System.out.print(x);
			if(count!=al.size()-1) {
				System.out.print(", ");
			}
			count++;
		}
		System.out.println("]");
		
		Iterator itr = al.iterator();
		int count1=0;
		System.out.print("[");
		 while (itr.hasNext()) {
			 System.out.print(itr.next());
			 if(count1!=al.size()-1) {
				 System.out.print(", ");
				 count1++;
			 }
		 }
		 System.out.println("]");
	}
	 
	
}