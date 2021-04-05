package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q1223 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int testCase=1; testCase<=1; testCase++) {
			br.readLine();
			String s = br.readLine();
			System.out.println("#" + testCase + " " + calPostfix(infixToPostfix(s)));
		}
	}
	
	private static int calPostfix(StringBuffer sb) {
		Stack<Integer> stack = new Stack<>();
		int answer=0;
		
		for(int i=0; i<sb.length(); i++) {
			char cur = sb.charAt(i);
			if(cur >= '0' && cur <='9') stack.add(cur-'0');
			if(cur == '+') {
				int second = stack.pop();
				int first = stack.pop();
				stack.add(first+second);
			}
			if(cur == '*') {
				int second = stack.pop();
				int first = stack.pop();
				stack.add(first*second);
			}
		}
		System.out.println(stack.toString());
		answer = stack.pop();
		
		return answer;
	}

	private static StringBuffer infixToPostfix(String s) {
		Stack<operator1> stack = new Stack<>();	
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i<s.length(); i++) {
			char cur = s.charAt(i);
			if(cur == '+') {
				while(!stack.isEmpty() && stack.peek().rank >= -2) {						
					sb.append(stack.pop().op);
				}
				stack.add(new operator1('+', -2));
			}
			if(cur == '*') {
				while(!stack.isEmpty() && stack.peek().rank >= -1) {
					sb.append(stack.pop().op);
				}
				stack.add(new operator1('*', -1));
			}
			if(cur >= '0' && cur <= '9') {
				sb.append(cur);
			}
		}
		
		while(!stack.isEmpty()) {
			sb.append(stack.pop().op);
		}
		return sb;
	}
	
}

class operator1{
	char op;
	int rank;
	operator1(char op, int rank){
		this.op = op;
		this.rank = rank;
	}
}