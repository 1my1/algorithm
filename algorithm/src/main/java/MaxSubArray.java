/**
 * Find the contiguous subarray within an array (containing at least one number) 
 * which has the largest sum.
 * @author wh
 *
 */
public class MaxSubArray {

	public static void main(String[] args) {
		
		int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums));
	}
	
	public static int maxSubArray(int[] nums){
		int maxSoFar=nums[0], maxEndingHere=nums[0];
	    for (int i=1;i<nums.length;++i){
	    	//f(i) = max{f(i)+array[i],array[i]}
	    	maxEndingHere= Math.max(maxEndingHere+nums[i],nums[i]);
	    	//max = max{f(i)}
	    	maxSoFar=Math.max(maxSoFar, maxEndingHere);	
	    }
	    return maxSoFar;
	}

}
