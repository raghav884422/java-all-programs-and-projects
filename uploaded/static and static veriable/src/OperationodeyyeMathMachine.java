import java.util.Scanner;



public class OperationodeyyeMathMachine {
	 public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("the operator");
	        String c = sc.next();
	    	int a= sc.nextInt();
	        int b = sc.nextInt();
	        yoyo y = new yoyo();
	        switch(c) {
	        case "addition":
	        	System.out.println("add:"+y.add(a, b));
	        break;
	        case "subtraction":
	        	System.out.println("sub: "+y.sub(a, b));
	        	break;
	        case "multiplication":
	        	System.out.println("mul:"+y.mul(a, b));
	        break;
	        case "division":
	        	if(b!=0) {
	        	System.out.println("div: "+y.div(a, b));
	        	}
	        else {
	        	System.out.println("invailed input");
	        	break;
	        }
	        }
	        

	    }
	    }
	       
class yoyo {
static int add(int m, int n) {
		return m+n;
	}

static int sub(int m, int n) {
		return m-n;
	}

static int mul(int m, int n) {
		return m*n;
	}

static int div(int m, int n) {
		return m/n;
	}

}
