package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1213 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int testCase=1; testCase<=10; testCase++) {
			br.readLine();
			String find = br.readLine();
			String change = find.toUpperCase();
			String s = br.readLine();
			int cnt=0;
			while(s.contains(find)) {
				s = s.replaceFirst(find, change);
				cnt++;
			}
			System.out.println("#"+testCase+" "+cnt+"\n");
		}
	}
}
