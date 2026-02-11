package OtherCollectionProblem;

import java.util.*;
public class paranthesisChecker {
	    public static boolean isBalanced(String expression) {
	    	Stack<Character> stack = new Stack<Character>();
	    	for(char ch :expression.toCharArray()) {
	    		if(ch=='('||ch=='{'||ch=='[') {
	    			stack.push(ch);
	    		}
	    		else if(ch==')'||ch=='}'||ch==']') {
	    			if(stack.isEmpty()) {
	    				
	    				return false;
	    			}
	    		
	    		char top = stack.pop();
	    		if(ch=='('&& top!=')'||ch=='{'&& top!='}'||ch=='['&& top!=']') {
	    			return false;
	    		}
	    		}
	    	}
	   
	    	return true;
	    	ArrayList al  
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String expression = sc.nextLine();  // Read user input

	        boolean result = isBalanced(expression);
	        System.out.println(result);
	    }
	
}
