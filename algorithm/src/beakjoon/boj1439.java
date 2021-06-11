package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1439 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		System.out.println(minOfReverse(s));
		
	}

	private static int minOfReverse(String s) {
		int count=0;
		for(int i=0; i<s.length()-1; i++) {
			if(s.charAt(i) != s.charAt(i+1)) count++;
		}
		int result = (int) ((count+1.0)/2);
		return result;
	}
	
}
