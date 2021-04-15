package exam;

import java.util.Stack;

public class programmers02 {

	public static void main(String[] args) {
		String s = "}]()[{";
		System.out.println(solution(s));
	}
	
    public static int solution(String s) {
        int answer = 0;
        
        StringBuffer sb = new StringBuffer(s);
        for(int i=0; i<sb.length(); i++) {
        	char ch = sb.charAt(0);
        	sb.deleteCharAt(0);
        	sb.append(ch);
        	if(countPair(sb) == true) answer++;
        }
        
        return answer;
    }

	private static boolean countPair(StringBuffer sb) {
		Stack<Character> stack = new Stack<>();
		
		char[] open_bracket = {'{','[','('};
        char[] close_bracket = {'}',']',')'};
        
        for(int i=0; i<sb.length(); i++) {
            for(int j=0; j<3; j++) {
                if(sb.charAt(i) == open_bracket[j]) {
                	stack.add(open_bracket[j]);
                }
                if(sb.charAt(i) == close_bracket[j]) {
                     if(!stack.isEmpty() && stack.peek() == open_bracket[j]) stack.pop();
                     else return false;
                }
            }
        }
        if(stack.isEmpty()) return true;
		return false;
	}

}
