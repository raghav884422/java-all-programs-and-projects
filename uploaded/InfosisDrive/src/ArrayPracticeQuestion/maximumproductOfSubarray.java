package ArrayPracticeQuestion;

import java.util.Scanner;

public class maximumproductOfSubarray {
	public static void main(String[] args) {
		
	
	  Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int[] nums = new int[n];

      for (int i = 0; i < n; i++) {
          nums[i] = sc.nextInt();
      }

      System.out.println(maxProduct(nums));
  }

  public static int maxProduct(int[] nums) {
      // Your logic here
	 int  n = nums.length;
	 int maxProduct = Integer.MIN_VALUE;
	 
	  for(int i=0;i<=n-1;i++) {
		  int subProduct = 1;
		  
		  for(int j =i;j<=n-1;j++) {
			  
			   subProduct *=nums[j];
			   if(subProduct>maxProduct) {
				 maxProduct = subProduct;
			   }
			   
		  }
	  }
	  return maxProduct;
	 
  }
} 


