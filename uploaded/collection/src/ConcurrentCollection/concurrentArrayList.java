package ConcurrentCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class concurrentArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(100);
		al.add(145);
		al.add(25);
		al.add(75);
		al.add(87);
//	for(int i =1;i<=al.size()-1;i++) {
//		System.out.println(al.get(i));
//		al.add(9990);
//	}
//	infinite loop problem to stop this we use iterator

//	Iterator<Integer> itr = al.iterator();
//	while (itr.hasNext()) {
//		System.out.println(itr.next());
//		al.add(9990);
//	}
//	it show error becase structure of array is changing 

//	to overcome this problem we use concurent class of collection
		CopyOnWriteArrayList<Integer> al1 = new CopyOnWriteArrayList<Integer>();
		al1.add(100);
		al1.add(145);
		al1.add(25);
		al1.add(75);
		al1.add(87);

		Iterator<Integer> itr = al1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			al1.add(9990);
		}
//		it make the copy of array if simultanius anything adding in it
		System.out.println(al1);
	}
}
