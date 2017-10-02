/**
 * 整数反转
 * @author wh
 *
 */
public class ReverseInteger {
	
	public static void main(String[] args) {
		System.out.println(reverse(1563847412));
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println((int)Math.pow(10, 9)*9);
		System.out.println(3.0);
		System.out.println(3*Math.pow(10, 10) > Integer.MAX_VALUE);
		
	}
	
	public static int reverse(int x){
		if(x == 0) return 0;
		int result = 0;int index = 0;
		int y = x;
		while(y > 0){
			y = y / 10;
			index++;
		}
		while(index >= 0){
			int z = x % 10;
			if(z*Math.pow(10, index-1) > Integer.MAX_VALUE) return 0;
			int sum = (int) (z*Math.pow(10, index-1));
			if((Integer.MAX_VALUE - result) < sum) return 0;
			result += sum;
			x = x / 10;
			index--;
		}
		return result;
	}
	
	public static int reverse2(int x){
		int result = 0;
		while(x != 0){
			int tail = x % 10;
			int newResult = result * 10 + tail;
			if((newResult - tail) != result) return 0;
			result = newResult;
			x = x / 10;
		}
		return result;
	}
}
