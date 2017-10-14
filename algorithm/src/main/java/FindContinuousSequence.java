import java.util.ArrayList;

/**
 * 输出所有和为S的连续正数序列
 * @author Administrator
 *
 */
public class FindContinuousSequence {

	public static void main(String[] args) {
		System.out.println(findContinuousSequence(3));
	}
	
	public static ArrayList<ArrayList<Integer>> findContinuousSequence(int sum){
		ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
		if(sum <= 1) return lists;
		int small = 1;
		int big = 2;
		while(small < (sum + 1)/2){
			//当前序列和
			int currentSum = sumOfList(small,big);
			//当前序列和 == sum 添加到lists
			if(currentSum == sum){
				ArrayList<Integer> list = new ArrayList<Integer>();
				for(int i = small; i <= big; i++){
					list.add(i);
				}
				lists.add(list);
				small++;big++;
			}else if(currentSum < sum){
				big++;
			}else{
				small++;
			}
		}
		return lists;
	}

	private static int sumOfList(int small, int big) {
		int sum = small;
		for(int i = small + 1; i <= big; i ++){
			sum += i;
		}
		return sum;
	}
	public static ArrayList<ArrayList<Integer> > findContinuousSequence2(int sum) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
        if(sum <= 1) return lists;
        int small = 1;
        int big = 2;
        int currentSum = 0;
        while(small < (sum+1)/2){
            while(currentSum < sum){
                big++;
                currentSum += big;
            }
            if(currentSum == sum){
                ArrayList<Integer> list = new ArrayList<Integer>();
                for(int i = small; i < big; i++){
                    list.add(i);
                }
                lists.add(list);
            }
            currentSum -= small;
            small++;
        }
        return lists;
    }
}
