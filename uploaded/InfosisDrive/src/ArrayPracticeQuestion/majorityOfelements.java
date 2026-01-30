package ArrayPracticeQuestion;

import java.util.Scanner;

public class majorityOfelements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i <= arr.length - 1; i++) {
			int count = 0;
			for (int j = 0; j <= arr.length - 1; j++) {
				if (arr[i] == arr[j]) {
					count++;


			}
				if (count > n / 2) {
					System.out.println(arr[i]);
					break;
				}else {
					System.out.println("No majority elemnt");
					break;
				}
			}
		}

	}

}
