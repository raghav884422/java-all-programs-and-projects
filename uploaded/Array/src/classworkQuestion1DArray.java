import java.util.Scanner;

public class classworkQuestion1DArray {
	public static void main(String[] args) {
		
	
	// make a prgram to store the height of the students in real number
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the value of array: ");
     double arr[] = new double[sc.nextInt()];
	for(int i=0;i<=arr.length-1;i++) {
		System.out.println("enter the height of the student :"); 
		arr[i] = sc.nextDouble();
		
	}
	System.out.println("the height of the student are: ");
	System.out.println("[");
	for(int i = 0;i<=arr.length-1;i++)	{
		System.out.print(arr[i]);
		if (i!=arr.length-1) {
			System.out.println(" , ");
		}
	}
	System.out.println("]");
	
	
	}
}
