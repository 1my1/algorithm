/**
 * Implement strStr().Returns the index of the first occurrence of needle in haystack, 
 * or -1 if needle is not part of haystack.
 * @author wh
 *
 */
public class StrStr {
	
	public static void main(String[] args) {
		System.out.println(strStr("mississippi","issipi"));
	}
	
	public static int strStr(String haystack, String needle){
		int len = haystack.length();
		int size = needle.length();
		if("".equals(needle) || needle == null) return 0;
		if(len < size) return -1;
		for(int i = 0; i < len; i++){
			if(haystack.substring(i, i+size >= len ? len : i+size).equals(needle)) return i;
		}
		return -1;
	}

}
