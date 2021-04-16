package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1233 {
	static String[] tree;
	static int n;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		for(int testCase=1; testCase<=10; testCase++) {
			n = Integer.parseInt(br.readLine());
			tree = new String[n*2+1];
			for(int i=1; i<=n; i++) {
				st = new StringTokenizer(br.readLine());
				tree[i] = st.nextToken();
			}
			isCalculate(tree);
		}
	}
	private static boolean isCalculate(String[] tree) {
		// 왼쪽 오른쪽 자식이 둘다 있어 - 연산자
		// 왼쪽 오른쪽 자식이 둘다 없어 - 숫자
		for(int i=1; i<=n; i++) {
			char ch = tree[i].charAt(0);
			if(!tree[i*2].equals("0") && !tree[i*2+1].equals("0") && !(ch >= 0 && ch <= 9)) return false;
		}
		return false;
	}
}
