package com.fan;

class fan {
	public static void main(String[] args) {
		fanProperties f1 = new fanProperties();
		fanProperties f2 = new fanProperties();
		
		f1.brand = "bajaj";
	    f1.colour = "red";
		f1.blades = "4";
		f2.brand = "bajaj";
	    f2.colour = "white";
		f2.blades = "2";
		f1.rotate();
		f2.colour();
		System.out.println(f1.brand+ " brand fan has number of blades:"+ f1.blades);
		System.out.println(f2.brand+ " brand fan has number of blades:"+ f2.blades);
		

	}
	
}
