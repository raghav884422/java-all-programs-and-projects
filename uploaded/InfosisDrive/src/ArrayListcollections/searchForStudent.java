package ArrayListcollections;

import java.util.*;
import java.util.Scanner;

public class searchForStudent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList al = new ArrayList();
		System.out.println("Enter the number of student");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i =0;i<=n-1;i++) {
			System.out.println("enter the name of "+i+"Student: ");
			al.add(sc.nextLine());
		}
		System.out.println("Student are : "+al);
	 System.out.println("enter the name of student to find");
	 String search = sc.nextLine();
	 if(al.contains(search)) {
		 System.out.println("Student is present");
	 }
	 else {
		 System.out.println("Student not found");
	 }
	}

}
