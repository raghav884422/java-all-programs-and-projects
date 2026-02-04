package practicePeoblem;

import java.util.Scanner;



public class vowelTohash {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
        String s1 = scan.next();
        String s2 = scan.next();
        String s3 = scan.next();
        StringBuffer sbBuffer =  new StringBuffer();
        for(int i =0;i<=s1.length()-1;i++) {
        	if (s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u') {
				sbBuffer.append("%");
			} else {
				sbBuffer.append(s1.charAt(i));
			}
        }
        for(int i =0;i<=s1.length()-1;i++) {
        	if (s2.charAt(i)=='a'||s2.charAt(i)=='e'||s2.charAt(i)=='i'||s2.charAt(i)=='o'||s2.charAt(i)=='u') {
				sbBuffer.append(s2.charAt(i));
			} else {
				sbBuffer.append("#");
			}
        }
        String uString =s3.toUpperCase();
        sbBuffer.append(uString);
        
        System.out.println(sbBuffer);
        
        }
        
	}

