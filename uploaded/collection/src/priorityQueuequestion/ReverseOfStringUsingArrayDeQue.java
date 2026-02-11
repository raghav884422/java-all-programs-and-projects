package priorityQueuequestion;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ReverseOfStringUsingArrayDeQue {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	char arr[]=s.toCharArray();
    ArrayDeque<Character> ad = new ArrayDeque<Character>();
    for(char x:arr) {
    	ad.add(x);
    }
    
    while(!ad.isEmpty()) {
    	System.out.print(ad.pollLast());
    }
}
}
