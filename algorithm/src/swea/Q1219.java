package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1219 {
	static final int MAX = 100;
	static boolean[] visited;
	static int[] arr;
	static int result;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		for(int testCase=1; testCase<=10; testCase++) {
			st = new StringTokenizer(br.readLine());
			st.nextToken();
			int edge = Integer.parseInt(st.nextToken());
			arr = new int[MAX*2];
			visited = new boolean[MAX*2];
			st = new StringTokenizer(br.readLine());
			for(int i=0; i<edge; i++) {
				int startVertex = Integer.parseInt(st.nextToken());
				int endVertex = Integer.parseInt(st.nextToken());
				if(arr[startVertex*2]==0) arr[startVertex*2] = endVertex;
				else if(arr[startVertex*2+1]==0) arr[startVertex*2+1] = endVertex;
			}
			System.out.println(Arrays.toString(arr));
			result=0;
			dfs(0);
			System.out.println("#"+testCase+" "+result);
		}
	}
	private static void dfs(int v) {
		visited[v] = true;
		
		if(v == 99) {
			result = 1;
			return;
		}
		
		if(arr[v*2] != 0 && result == 0) dfs(arr[v*2]);
		if(arr[v*2+1] != 0 && result == 0) dfs(arr[v*2+1]);
	}
}
