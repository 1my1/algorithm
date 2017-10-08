/**
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * @author wh
 *
 */
public class RemoveDuplicates {

	public static void main(String[] args) {
		
		int nums[] = {1,1,2,3,3,4,5,6};
		System.out.println(removeDuplicates(nums));

	}
	
	public static int removeDuplicates(int[] nums){
		int len = nums.length;
		int index = len > 0 ? 1 : 0;
		for(int i = 0; i < len; i++){
			if(nums[i] > nums[index-1]) 
				nums[index++] = nums[i];
		}
		return index;
	}

}
