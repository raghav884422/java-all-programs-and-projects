package arrayListFuctioning;

import java.util.ArrayList;

class arraylist {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		System.out.println("Size => "+al.size());
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(152);
		al.add(175);
		System.out.println("Size => "+al.size());
		al.add("raghav");
		al.add(3.454745);
		al.add(true);
		al.add('X');
	    System.out.println(al);
	    al.add(2,999);
	    System.out.println(al);
	    System.out.println(al.get(2)); // value of second index
	    System.out.println(al.indexOf(999));  // index of 999
	    System.out.println(al.isEmpty());
	    System.out.println(al.getFirst());
	    System.out.println(al.getLast());
	    System.out.println("Size -> "+al.size());
	    System.out.println(al.remove(2));
	    System.out.println(al);
	    System.out.println("Size -> "+al.size());
	    al.clear();
	    System.out.println(al);
	    
		
		
	}
}