import java.util.Stack;


public class ValidParentheses {

	public static void main(String[] args) {
		
		System.out.println(isValid("()()(){}{}{})"));

	}
	
	public static boolean isValid(String s){
		char ch[] = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0; i < ch.length; i++){
			if(ch[i] == '(') stack.push(')');
			else if(ch[i] == '[') stack.push(']');
			else if(ch[i] == '{') stack.push('}');
			else if(stack.isEmpty() || stack.pop() != ch[i])
				return false;
		}
		return stack.isEmpty();
	}

}
