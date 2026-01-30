package ArrayPracticeQuestion;

import java.util.Scanner;

public class nextIncreaseTemprature {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temprature [] = new int[n];
		for(int i = 0;i<n-1;i++) {
			temprature[i]=sc.nextInt();
		}
		int result[] = dailyTemprature(temprature);
		for(int r :result) {
		   System.out.println(r+" ");
		}
		
	}
	public static int[] dailyTemprature(int[]temprature) {
		int n = temprature.length;
		int result[] =new int[n];
		for(int i = 0;i<n-2;i++) {
			for(int j = i+1;j<=n-1;j++) {
				if(temprature[j]>temprature[i]) {
					result[i]=j-i;
					break;
				}
			}
		}
		return result;
	}

}
