import java.util.ArrayList;
import java.util.List;

/**
 * 题目描述：
 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
 * 例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，
 * 那么一共存在6个滑动窗口，他们的最大值分别为{4,4,6,6,6,5}；
 *  针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个： 
 *  {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， 
 *  {2,3,[4,2,6],2,5,1}， {2,3,4,[2,6,2],5,1}， 
 *  {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
 * 
 * @author Administrator
 *
 */
public class MaxSlidingWindow {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {2,3,4,2,6,2,5,1};
		int size = 3;
		System.out.println(maxInWindows(num,size));
	}
	
	public static List<Integer> maxInWindows(int[] num, int size){
		//开始滑动
		int i = 0;
		//数组长度
		int len = num.length;
		List<Integer> list = new ArrayList<Integer>();
		if(size == 0) return list;
		while(i+size <= len){
			int max = num[i];
			//找出size中最大
			for(int j = i; j < i + size; j++){
				if(num[j] > max) 
					max = num[j];
			}
			list.add(max);
			//滑动一位
			i++;
		}
		return list;
	}

}
