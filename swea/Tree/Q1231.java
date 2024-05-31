package swea.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1231 {
	static int n;
	static char[] tree;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		for(int testCase=1; testCase<=10; testCase++) {
			n = Integer.parseInt(br.readLine());
			tree = new char[n+1];
			for(int i=0; i<n; i++) {
				st = new StringTokenizer(br.readLine());
				int num = Integer.parseInt(st.nextToken());
				tree[num] = st.nextToken().charAt(0);
			}
			System.out.print("#"+testCase+" ");
			inOrder(1);
			System.out.println();
		}
	}

	private static void inOrder(int v) {
		if(v>n) return;
		inOrder(2*v);
		System.out.print(tree[v]);
		inOrder(2*v+1);
	}
}