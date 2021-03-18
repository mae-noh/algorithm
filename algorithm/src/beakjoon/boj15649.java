package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class boj15649 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuffer sb = new StringBuffer();
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		dfs(N, M, sb);
		bw.close();
	}

	private static StringBuffer dfs(int n, int m, StringBuffer sb) {
		if(m==0) return sb;		
		return dfs(n, m-1, sb);
	}
	
}
