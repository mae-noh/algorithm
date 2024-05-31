package swea.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q1218 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int testCase=1; testCase<=1; testCase++) {
			br.readLine();
			String s = br.readLine();
			System.out.println("#"+testCase+" "+isPair(s));
		}
	}

	private static int isPair(String s) {
		Stack<Character> stack = new Stack<>();
		char[] open_bracket = {'{','[','(','<'};
		char[] close_bracket = {'}',']',')','>'};
		for(int i=0; i<s.length(); i++) {
			for(int j=0; j<4; j++) {
				System.out.println(stack.toString());
				if(s.charAt(i) == open_bracket[j]) stack.add(open_bracket[j]);
				if(s.charAt(i) == close_bracket[j]) {
					 if(stack.peek() == open_bracket[j]) stack.pop();
					 else return 0;
				}
			}
		}
		if(stack.isEmpty()) return 1;
		return 0;
	}
}
