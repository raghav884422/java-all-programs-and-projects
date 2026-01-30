package String;

import java.util.Scanner;

public class vowelStar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char arr[]=s.toCharArray();
		StringBuffer sb = new StringBuffer();
		for(int i =0;i<=arr.length-1;i++) {
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u') {
				System.out.print("*");
			}
			else {
				System.out.print(arr[i]);
			}
		}

	}

}
