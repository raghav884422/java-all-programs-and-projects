package hashsetOverride;

import java.util.HashSet;

public class employeeApp {
	public static void main(String[] args) {
		employee e1 = new employee(12,"raghav",9500);
		employee e2 = new employee(13,"mohan",8500);
		employee e3 = new employee(14,"sohan",6500);
		employee e4 = new employee(12,"vivek",9500);
		employee e5 = new employee(15,"ram",5500);
		HashSet<employee> hs = new HashSet<employee>();
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);
		System.out.println(hs);
		
		
	}



}
