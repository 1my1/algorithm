/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * 
 * Example:
 * 
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * 
 * @author wh
 *
 */

public class TwoNum {
	
	public static void main(String[] args) {
		int[] nums = {-1,-2,-3,-4,-5};
		int target = -8;
		int array[] = twoNum(nums,target);
		for(int i = 0; i < 2; i++){
			System.out.println(array[i]);
		}
	}
	
	public static int[] twoNum(int[] nums, int target){
		int array[] = new int[2];
		int len = nums.length;
		for(int i = 0; i < len; i++){
			for(int j = i+1; j < len; j++){
				if(nums[i] + nums[j] == target && array[0] == array[1]){
					array[0] = i;
					array[1] = j;
				}
			}
		}
		return array;
	}

}
