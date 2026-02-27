package upCastingdowncasting;

public class Main {
public static void main(String[] args) {
	child chi = new child("ram");
	chi.displayDetails();
	chi.dirnkCoke();
	 Parent ref;
	 ref = chi;
	 ref.displayDetails();
//	 ref.drinkCoke();        because it can not contain coke mathod in it
	 ((child)(ref)).dirnkCoke();   // now it become like a child to get the specific detail of child
	 
	 
//	 another practice but it is not in use becaue if have parent class other than parent like 
//	 grand parent so that we can maken ref 3 as for grand parent class 
//	Parent ref3;
//	ref3=chi;
//	ref3.displayDetails();
//	((child)(ref3)).dirnkCoke();
//	
	 
	  Parent ref2 = new child("ashutosh");
	 ((child)ref2).displayDetails();
	 ((child)ref2).dirnkCoke();
}
}
