
public class StringClass {
	public static void main(String[] args) {
//		immutable String :- that can not be change
//		there are two type to create the immutable string by using new keyword and direct declearing
//		if you want to check  without creating new object it will go on string pool 
//		 here no dublicate object will be created in string pool  so s1 reference is equal to s2
//		String s1 = "Rama";
//		String s2 = "Rama";
		
		
		String s1 = new String("Rama"); 
		String s2 = new String("Rama"); 
		if(s1==s2) {   // this is use to check the reference of the string i.e.means same address 
			System.out.println("Reference are equal");
		}
		else {
			System.out.println("Reference are not equal");
		}
		if(s1.equals(s2)) { // this is use to check the value of the string i.e.means "Rama" ="Rama" 
			System.out.println("String value are equal");
		}
		else {
			System.out.println("String value are not equal");
		}
	}

}
