package swea.ETC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q1224 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int testCase=1; testCase<=10; testCase++) {
			br.readLine();
			String s = br.readLine();
			System.out.println("#"+testCase+" "+calPostfix(infixToPostfix(s)));
		}
	}

	private static int calPostfix(StringBuffer sb) {
		int answer=0;
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0; i<sb.length(); i++) {
			char cur = sb.charAt(i);
			if(cur >= '0' && cur <= '9') {
				stack.add(cur-'0');
			}else if(cur == '+') {
				int second = stack.pop();
				int first = stack.pop();
				stack.add(first+second);
			}else if(cur == '*') {
				int second = stack.pop();
				int first = stack.pop();
				stack.add(first*second);				
			}
		}
		
		answer = stack.pop();
		
		return answer;
	}

	private static StringBuffer infixToPostfix(String s) {
		StringBuffer sb = new StringBuffer();
		Stack<operator> stack = new Stack<>();
		
		for(int i=0; i<s.length(); i++) {
			char cur = s.charAt(i);
			
			if(cur == '(') {
				stack.add(new operator('(', -3));
			}else if(cur == ')') {
				while(!stack.isEmpty()) {
					if(stack.peek().op == '(') {
						stack.pop();
						break;
					}
					sb.append(stack.pop().op);
				}
			}else if(cur >= '0' && cur <= '9') {
				sb.append(cur);
			}else if(cur == '+') {
				while(!stack.isEmpty() && stack.peek().rank >= -2) {
					sb.append(stack.pop().op);
				}
				stack.add(new operator('+',-2));
			}else if(cur == '*') {
				while(!stack.isEmpty() && stack.peek().rank >= -1) {
					sb.append(stack.pop().op);
				}
				stack.add(new operator('*',-1));
			}
			
		}
		while(!stack.isEmpty()) {
			sb.append(stack.pop().op);
		}
		
		return sb;
	}
}

class operator{
	char op;
	int rank;
	operator(char op, int rank){
		this.op = op;
		this.rank = rank;
	}
}
