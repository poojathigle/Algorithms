package algorithms;

public class KadanesAlgorithm {
	/**
	   * Kadane's Algorithm to get the sum of the largest sum contiguous sub-array
	   * Handles both positive and negative numbers
	   * O(n) time complexity and O(1) space complexity.
	   */
	  public static int maximumSumSubArray(int[] array) {
	    int max_ending_here = 0, max_so_far = Integer.MIN_VALUE;
	    for(int number : array) {
	    	max_ending_here += number;
	    	if(max_ending_here < number)
	    		max_ending_here = number;
	    	if(max_so_far < max_ending_here)
	    			max_so_far = max_ending_here;
	    }
	    return max_so_far;
	  }

		public static void main(String[] args) {
			int [] array = {-2, -3, 4, -1, -2, 1, 5, -3};
		    System.out.println("Maximum contiguous sum is " 
		                       + KadanesAlgorithm.maximumSumSubArray(array)); 
		}
	}
	// Output: Maximum contiguous sum is 7
