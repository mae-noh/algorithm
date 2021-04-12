package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1233 {
	static String[] tree;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] st;
		for(int testCase=1; testCase<=10; testCase++) {
			int n = Integer.parseInt(br.readLine());
			tree = new String[n];
			for(int i=1; i<=n; i++) {
				st = br.readLine().split(" ");
				tree[i] = st[1];
			}
			inOrder(1);
		}
	}

	private static boolean inOrder(int d) {
		//
	}
}
