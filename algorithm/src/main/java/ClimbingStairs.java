/**
 * 一共n节阶梯，一次可以1节或者两节，爬到n节共有多少种爬法
 * @author wh
 *
 */
public class ClimbingStairs {

	public static void main(String[] args) {
		
		System.out.println(climbingStairs(4));

	}
	
	public static int climbingStairs(int n){
		if(n <= 2) return n;
		int first = 1;
		int second = 2;
		int third = 0;
		for(int i = 3; i <= n; i++){
			third = first + second;
			first = second;
			second = third;
		}
		return third;
	}
	
	public static int climbingStairs2(int n){
		if(n <= 2) return n;
		return climbingStairs2(n - 1) + climbingStairs(n - 2);
	}

}
