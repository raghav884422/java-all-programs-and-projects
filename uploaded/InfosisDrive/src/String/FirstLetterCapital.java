package String;

import java.util.Scanner;

public class FirstLetterCapital {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the new String ");
		String name = scan.nextLine();
		
		if(name.isEmpty()) {
			System.out.println("name can not be empty");
		}
		String []parts = name.toLowerCase().split("//s+");   // // parts will contain: ["This", "is", "a", "test"]
		StringBuilder sb = new StringBuilder();
		for (String p : parts) {
			if(p.isEmpty())
				continue;
			sb.append(Character.toUpperCase(p.charAt(0)));
			sb.append(p.substring(1)).append(" ");
			
		}
		System.out.println(sb.toString().trim());
	}

}
