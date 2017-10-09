import java.util.Arrays;

/**
 * Given a sorted array and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 * @author wh
 *
 */
public class SearchInsert {
	
	public static void main(String[] args) {
		int nums[] = {1,3,5,7};
		int target = 4;
		System.out.println(searchInsert3(nums,target));
	}
	
	public static int searchInsert(int[] nums,int target){
		int len = nums.length;
		int index = -1;
		for(int i = 0; i < len; i++){
			if(nums[i] < target){
				index = i+1;
			}else if(nums[i] == target){
				index = i;
				break;
			}else if(nums[i] > target){
				index = i;
				break;
			}
		}
		return index;
	}
	public static int searchInsert2(int[] nums,int target){
		int pos = Arrays.binarySearch(nums, target);
		return (pos < 0) ? -pos - 1 : pos;
	}
	
	public static int searchInsert3(int[] nums,int target){
		int low = 0;
		int high = nums.length - 1;
		while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = nums[mid];

            if (midVal < target)
                low = mid + 1;
            else if (midVal > target)
                high = mid - 1;
            else
                return mid; // key found
        }
		return low;
	}
}
