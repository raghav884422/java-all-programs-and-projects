package functionsInString;

public class functionanduses {
	public static void main(String[] args) {
		String s1 = "Kodnest";
		String s2 = "Kodnest";
		String s3 = "KoDnEsT";
		String s4 = "Goverment";
		if(s1==s2)
			System.out.println("the reference of s1 ="+s1+" and s2= "+s2+" are equal");
		else
			System.out.println("the reference of s1 ="+s1+" and s2= "+s2+" are not equal");	
		if(s1.equals(s3))
			System.out.println("the string value of s1 ="+s1+" and s3= "+s3+" are equal");
		else
			System.out.println("the string value of s1 ="+s1+" and s3= "+s3+" are not equal");	
		if(s1.equalsIgnoreCase(s3))
			System.out.println("the string value of s1 ="+s1+" and s3= "+s3+" are equal by ignoring case");
		else
			System.out.println("the string value of s1 ="+s1+" and s3= "+s3+" are not equal by ignoring case");
		int res = s1.compareTo(s4);
		System.out.println("res value is "+res);
		if(res>0)
			System.out.println("the string value of s1 = "+s1+" is greater than s4= "+s4);
		else if (res<0)
			System.out.println("the string value of s4 = "+s4+" is greater than s1= "+s1);
		else 
			System.out.println("the string value of s4 = "+s4+" are equal s1= "+s1);
			
		
	}

}
