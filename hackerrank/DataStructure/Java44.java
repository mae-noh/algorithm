package hackerrank.DataStructure;
import java.util.*;
class Java44{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
			
			System.out.println(isPair(input) ? "true" : "false");
		}
		
	}
	
	// 1.짝이 안맞는 경우
	// 2.남는 경우

	private static boolean isPair(String input) {
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			if(ch == '{' || ch == '(' || ch == '[') stack.push(ch);
			if(ch == '}' || ch == ')' || ch == ']') {
				if(stack.isEmpty()) return false;
				char top = stack.pop();
				if(ch == '}' && top != '{' || ch == ')' && top != '(' || ch == ']' && top != '[') return false;				
			}
		}
				
		return stack.isEmpty();
	}
}




