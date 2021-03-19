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
		boolean[] arr = new boolean[N+1];
		int M = Integer.valueOf(st.nextToken());
		dfs(N, M, sb, arr);
		bw.write(sb+"");
		bw.close();
	}

	private static void dfs(int n, int m, StringBuffer sb, boolean[] arr) {
		if(m==0) {
			sb.append("\n"); return;
		}
		
		for(int i=1; i<=n; i++) {
			if(arr[i]) continue;
			arr[i] = true;
			sb.append(i).append(" ");
			dfs(n, m-1, sb, arr);
			arr[i] = false;
		}
		
	}
	
}
