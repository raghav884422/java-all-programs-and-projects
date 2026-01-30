package ArrayPracticeQuestion;

import java.util.Scanner;

class firstpeakelement {
	public static void main(String[] args) {
	
		        Scanner sc = new Scanner(System.in);

		        int n = sc.nextInt();
		        int[] nums = new int[n];

		        for (int i = 0; i < n; i++) {
		            nums[i] = sc.nextInt();
		        }

		        System.out.println(findFirstPeak(nums));
		    }

		    public static int findFirstPeak(int[] nums) {
		      //complete your code here 
		      int n = nums.length;
		      if(n==1)
		      return 0;
		      for(int i=0;i<=n-1;i++){
		      if(i==0 && nums[i]>nums[i+1]){
		            return i;
		      } else if(i==n-1 && nums[i]>nums[i-1]) {
		             return i;
		      }
		      else if(i!=0&& i!=n-1) {
		        if(nums[i]>nums[i+1] && nums[i]>nums[i-1]){
		            return i;
		        }
		      }
		      }
		      return -1;
		    }
}