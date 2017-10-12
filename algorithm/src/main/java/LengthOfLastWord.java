/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', 
 * return the length of last word in the string.
 * If the last word does not exist, return 0.
 * @author wh
 *
 */
public class LengthOfLastWord {

	public static void main(String[] args) {
		String s = "hello world 1";
		System.out.println(s);
		System.out.println(s.trim());
		int len1 = s.trim().length();
		System.out.println(len1);
		int len2 = s.trim().lastIndexOf(" ");
		System.out.println(len2);
//		System.out.println(s.trim().length()-s.trim().lastIndexOf(" ") -1);
//		System.out.println(lengthOfLastWord("a "));

	}
	
	public static int lengthOfLastWord(String s){
		int len = s.length()-1;
		int num = 0;
		//去除最后单词空格
		while(len >= 0 && s.charAt(len) == ' '){
			len--;
		}
		//计算单词长度
		while(len >= 0 && s.charAt(len) != ' '){
			len--;
			num++;
		}
		return num;
	}
	
	public static int lengthOfLastWord2(String s){
		return s.trim().length() - s.lastIndexOf(" ");
	}

}
