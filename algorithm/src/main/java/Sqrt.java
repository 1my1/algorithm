/**
 * 平方根
 * @author wh
 *
 */
public class Sqrt {
	public static void main(String[] args) {
		System.out.println(sqrt(2147395599));
	}
	
	public static int sqrt(int x){
//		int r = x/2;
//		while(r*r > x){
//			r = (r + x/r)/2;
//		}
//		return r;
		long mid = x;
        while(mid*mid > x){
            mid = (mid + x/mid)/2;
        }
        return (int) mid;
	}
}
