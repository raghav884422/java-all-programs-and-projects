
public class StringclassQuestion {
	public static void main(String[] args) {
		String s1 = "Rama";
		String s2 = "Sita";
		String s3 = s1+s2;
		String s4 = s1+s2;
		if(s3==s4) {   // this is use to check the reference of the string i.e.means same address 
			System.out.println("Reference are equal");
		}
		else {
			System.out.println("Reference are not equal");
		}
		if(s3.equals(s2)) { // this isr use to check the value of the string i.e.means "Rama" ="Rama" 
			System.out.println("String value are equal");
		}
		else {
			System.out.println("String value are not equal");
		}
	}
	}


