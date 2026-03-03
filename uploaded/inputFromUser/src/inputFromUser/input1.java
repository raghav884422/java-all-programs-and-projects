package inputFromUser;

import java.util.*;
public class input1 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
        
		System.out.println("enter byte");   
        byte a= scan.nextByte();
        System.out.println("value is"+a);
        
        System.out.println("enter char");
        char b= scan.next().charAt(2);
        System.out.println("value is"+ " " +b);
        
        System.out.println("enter int");
        int c= scan.nextInt();
        System.out.println("value is" +c);
        
        System.out.println("enter String");
        scan.nextLine();
        String e= scan.nextLine();
        System.out.println("value is"+e);
        
        System.out.println("enter long");
        long f= scan.nextLong();
        System.out.println("value is"+f);
        
        System.out.println("enter float");
        float g= scan.nextFloat();
        System.out.println("value is"+g);
        
        System.out.println("enter double");
        double h= scan.nextDouble();
        System.out.println("value is"+h);
        
        System.out.println("enter boolean");
        boolean i= scan.nextBoolean();
        System.out.println("value is"+i);
        
        System.out.println("enter a single charecter");
        char j= scan.next().charAt(0);
        System.out.println("value is"+j);
        
	}

}
