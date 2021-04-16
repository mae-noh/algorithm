package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q1222 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		for(int testCase=1; testCase<=10; testCase++) {
			br.readLine();
			s = br.readLine();
			String[] st = s.split("");
			for(String si : st) {
				System.out.print(si + " ");
			}
			//System.out.println("#"+testCase+" "+infixToPostfix(s));
		}
	}

}
//
//	private static int infixToPostfix(String s) {
//		Stack<Character> stack = new Stack<>();
//		StringBuffer sb = new StringBuffer();
//		
//		for(int i=0; i<s.length(); i++) {
//			char op = s.charAt(i);
//			if(op != '+') {
//				sb.append(op);
//			}
//			if(op == '+' && !stack.isEmpty()) {
//				stack.pop();
//				sb.append(op);
//			}
//			if(op == '+' && stack.isEmpty()) stack.add(op);
//		}
//		sb.append(stack.pop());
//		return calPostfix(sb);
//	}
//
//	private static int calPostfix(StringBuffer sb) {
//		Stack<Character> stack = new Stack<>();
//		for(int i=0; i<sb.length(); i++) {
//			char op = sb.charAt(i);
//			if(op != '+') {
//				stack.add((char) (op - '0'));
//			}
//			if(op == '+') {
//				int second = stack.pop();
//				int first = stack.pop();
//				stack.add((char) (first+second));
//			}
//		}
//		return stack.pop();
//	}
//	
//}
