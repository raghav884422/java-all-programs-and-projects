package dog;

import java.awt.Color;

public class dogMain {
	public static void main(String[] args) {
		
	
	dog d1 = new dog();
	dog d2 = new dog();
	

	 d1.name ="utkash";
	 d1.colour = "black" ;
	 d1.breed = "german";
	 d1.cost = 2000;
	 System.out.print(d1.name + d1.colour+ d1.breed + d1.cost );
	 d1.bark();
	 d1.sleep();
	 d2.bark();
	 d2.sleep();

	 
	 
	 
}
}
