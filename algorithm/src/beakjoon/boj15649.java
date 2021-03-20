package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj15649 {

	static StringBuilder sb = new StringBuilder();
	static int[] arr;
	static boolean[] visited;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		arr = new int[N+1];
		visited = new boolean[N+1];
		dfs(0, N, M, arr, visited, bw);
		bw.write(sb+"");
		bw.close();
		br.close();
	}

	private static void dfs(int idx, int n, int m, int[] arr, boolean[] visited, BufferedWriter bw) {
		if(idx == m) {
			for(int i=0; i<m; i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i=1; i<=n; i++) {
			if(visited[i]) continue;
			visited[i] = true;
			arr[idx] = i;
			dfs(idx+1, n, m, arr, visited,bw);
			visited[i] = false;
		}
		
	}
	
}
