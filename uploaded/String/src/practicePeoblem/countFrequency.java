package practicePeoblem;

import java.util.Scanner;

public class countFrequency {

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
			String s = scan.nextLine();
			char arr[] = s.toCharArray();
			boolean visit[] = new boolean[arr.length];
	        System.out.println("Character Frequencies: ");
			for(int j=0;j<=arr.length-1;j++) {
				if (visit[j]) continue; 
				int count = 0;
				for (int i = 0; i <= s.length() - 1; i++) {
					if (arr[i]==arr[j]) {
		                      count++;
		                      visit[i] = true;
					}

				}
				System.out.println(arr[j] + ": " + count);
			

	        scan.close();
	    }
	

}}
