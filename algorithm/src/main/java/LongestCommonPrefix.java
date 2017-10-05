
public class LongestCommonPrefix {

	public static void main(String[] args) {
		
		String string = "11111233333";
		for(int i = string.length(); i > 0; i--){
//			System.out.println(string.substring(0, i));
			System.out.println(string.length());
			string = string.substring(0, i);
		}
//		string = string.substring(0, 11);
		//System.out.println(string);
		String str[] = {};
		System.out.println(longestCommonPrefix(str)+"---------");
	}
	
	public static String longestCommonPrefix(String[] prefix){
		int len = prefix.length;
		String shortestString = shortestString(prefix);
		for(int i = 0; i <= len -1; i++){
			if(!prefix[i].startsWith(shortestString)){
				i = 0;
				shortestString = shortestString.substring(0, shortestString.length()-1);
				continue;
			}
		}
		return shortestString;
	}
	
	public static String shortestString(String[] prefix){
		int len = prefix.length;
		if(len <= 0) return "";
		int min = Integer.MAX_VALUE;
		int index = 0;
		for(int i = 0; i < len -1; i++){
			if(prefix[i].length() < min){
				min = prefix[i].length();
				index = i;
			}
		}
		return prefix[index];
	}

}
