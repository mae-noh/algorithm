package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1226 {
	static final int MAX = 100;
	static char[][] arr;
	static boolean[][] visited;
	static int result;
	static int[] dx = {0,1,0,-1};
	static int[] dy = {1,0,-1,0};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int testCase=1; testCase<=10; testCase++) {
			br.readLine();
			arr = new char[MAX][MAX];
			visited = new boolean[MAX][MAX];
			for(int i=0; i<MAX; i++) {
				arr[i] = br.readLine().toCharArray();
			}
			result = 0;
			dfs(1,1);
			visited[1][1] = true;
			System.out.println("#"+testCase+" "+result);
		}
	}

	private static void dfs(int x, int y) {		
		if(arr[x][y] == '3') {
			result = 1;
			return;
		}
		
		for(int i=0; i<4; i++) {
			int nextX = x + dx[i];
			int nextY = y + dy[i];
			if(nextX < 0 || nextY < 0 || nextX >= MAX || nextY >= MAX) continue;
			if(visited[nextX][nextY] || arr[nextX][nextY] == '1') continue;
			visited[nextX][nextY] = true;
			dfs(nextX, nextY);
			visited[nextX][nextY] = false;
		}
	}
}
