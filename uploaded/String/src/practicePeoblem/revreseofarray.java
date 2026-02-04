package practicePeoblem;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class revreseofarray {
	public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       String str1 = scan.next();
       String str2 = scan.next();
       str1 = str1.toLowerCase();
       str2 = str2.toLowerCase();
       char arr1[] = str1.toCharArray();
       char arr2[] = str2.toCharArray();
       Arrays.sort(arr1);
       Arrays.sort(arr2);
       System.out.println(Arrays.equals(arr1,arr2));
       
       
       
	}
}
