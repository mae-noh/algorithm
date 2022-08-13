package swea.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1217 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int testCase=1; testCase<=10; testCase++) {
			br.readLine();
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			System.out.println("#"+testCase+" "+pow(N,M,1));
		}
	}

	private static int pow(int n, int m, int d) {
		if(m==0) {
			return d;
		}
		return pow(n,m-1,d*n);
	}
}
