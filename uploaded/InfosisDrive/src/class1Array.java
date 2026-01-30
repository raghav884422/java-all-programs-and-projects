import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class class1Array{
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		int arr [] = new int[size];
		for(int i = 0;i<=arr.length-1;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		for(int i = 0;i<=arr.length-1;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		Arrays.sort(arr);
		for(int i = 0;i<=arr.length-1;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		Arrays.toString(arr);
		for(int i = 0;i<=arr.length-1;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		Arrays.binarySearch(arr, 10);
		for(int i = 0;i<=arr.length-1;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		Arrays.fill(arr, 5);
		for(int i = 0;i<=arr.length-1;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		int arr2[] = new int[size];
		for(int i = 0;i<=arr.length-1;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println();
		System.out.println(Arrays.equals(arr, arr2));
		
		
		
		
		
	}

}
