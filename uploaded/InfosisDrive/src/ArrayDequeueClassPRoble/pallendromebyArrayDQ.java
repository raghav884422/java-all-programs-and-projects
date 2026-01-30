package ArrayDequeueClassPRoble;

import java.util.ArrayDeque;
import java.util.Scanner;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class pallendromebyArrayDQ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word: ");
		String word = sc.nextLine().toLowerCase();
		ArrayDeque<Character> dq = new ArrayDeque<Character>();
		for (char c : word.toCharArray())
			dq.addLast(c);

		boolean ispallendrome = true;
		while (dq.size() > 1) {
			if (!dq.removeFirst().equals(dq.removeLast())) {
				ispallendrome = false;
				break;

			}
		}
		System.out.println(word+ (ispallendrome ? " is palendrome" : " is not a palendrome"));

	}
}
