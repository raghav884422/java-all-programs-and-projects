package functionsInString;

import java.text.MessageFormat;

public class formattingOfString {
	public static void main(String[] args) {
//		many way to format a string
//		String str1 ="Hello, %s how are you";
//		System.out.printf(str1,"raghav");
		
		
//		String str2 ="Hello, %s your total bill is $ %.2f";
//		System.out.printf(str2,"raghav",123.458);
		
		
		String str3=String.format("Hello, %s your total bill is $ %.2f","ravi",1156.858);
	System.out.println(str3);
//	another approch
	String st ="hello {0} , your bill is {1}";
	String message = MessageFormat.format(st,"raghav","500");
	System.out.println(message);
	}

}
