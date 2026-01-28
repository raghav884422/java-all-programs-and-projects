import java.util.Scanner;

public class arrayintoclassQuestion {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
   System.out.println("Enter the length of array: ");  
	// here we can taking the input from user and without storing it in any 
//    veriable we directly put in the array other way is 
   //int n = sc.nextInt[]; 
	
	int arr[] = new int[sc.nextInt()]; 
//	System.out.println("enter the marks of student " +1);
//	arr[1] = sc.nextInt();
//	System.out.println("enter the marks of student " +2);
//	arr[2] = sc.nextInt();
//	System.out.println("enter the marks of student " +3);
//	arr[3] = sc.nextInt();
//	System.out.println("enter the marks of student " +4);
//	arr[4] = sc.nextInt();
//	insted of upper we use for loop
	for (int i =0;i<=arr.length-1;i++) {
		System.out.println("enter the marks of student " +i);
		arr[i] = sc.nextInt();
	}
	System.out.println("Array elements ");
	
	// this is use to print the number which is present inside the array
	
//	System.out.print(arr[1]);
//	System.out.print(arr[2]);
//	System.out.print(arr[3]);
//	System.out.print(arr[4]);
	
	System.out.print("[");         // to get Output in this for arr =[2,3,3]
	for (int i = 0;i<=arr.length-1;i++) {
		System.out.print(arr[i]);
		
		// this will use to remove the last coma ","
		if (i!=arr.length-1) {
			System.out.print(",");
		}
	}
	System.out.println("]");           // to get Output in this for arr =[2,3,3]
}
}
