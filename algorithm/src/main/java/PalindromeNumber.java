/**
 * 判断一个整数是否是回文
 * @author wh
 *
 */
public class PalindromeNumber {
	public static void main(String[] args) {
//		System.out.println(isPalindrome(-2147483648));
		System.out.println(isPalindrome2(11111));
	}
	
	public static boolean isPalindrome(int num){
		String str = String.valueOf(num);
		char ch[] = str.toCharArray();
		boolean flag = true;
		int begin = 0;
		int end = ch.length-1;
		while(begin < end){
			if(ch[begin] != ch[end]){
				flag = false;
				break;
			}
			begin++;
			end--;
		}
		return flag;
	}
	
	public static boolean isPalindrome2(int num){
		//个位数或者负数直接返回错误
		if(num < 0 || (num != 0 && num % 10 == 0)) return false;
		int res = 0;
		//num反转
		while(num > res){
			res = res * 10 + num % 10;
			num = num / 10;
		}
		return (num == res) || (num == res/10);
	}
}
