package practicePeoblem;

import java.util.Scanner;

public class rotateWorldasperuser {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		String arr[]=string.split(" ");
		StringBuilder sbBuilder = new StringBuilder();
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]==arr[i].toUpperCase()) {
				sbBuilder.append(arr[i].toLowerCase());
				}else {
					sbBuilder.append(arr[i].toUpperCase());
				}
			System.out.println(sbBuilder);
		}
		
	}

}
