package beakjoon.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj14502 {

	static int[][] arr;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int N, M, max=0;
	static Queue<int[]> q = new LinkedList<>();

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N][M];
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		dfs(0);
		System.out.println(max);
	}
	
	private static void dfs(int cnt) {
		if(cnt == 3) {
			max = Math.max(max, bfs());
			return;
		}
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(arr[i][j] == 0) {
					arr[i][j] = 1;
					dfs(cnt+1);
					arr[i][j] = 0;
				}
			}
		}
	}
	
	private static int bfs() {
		
		int[][] arrCopy = new int[N][M];
		boolean[][] visited = new boolean[N][M];
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				arrCopy[i][j] = arr[i][j];
				if(arrCopy[i][j] == 2) q.offer(new int[] {i,j});
			}
		}
		
		while(!q.isEmpty()) {
			int[] curPos = q.poll();
			int x = curPos[0];
			int y = curPos[1];
			visited[x][y] = true;
			for(int i=0; i<4; i++) {
				int nextX = x+dx[i];
				int nextY = y+dy[i];
				if(nextX < 0 || nextY < 0 || nextX >= N || nextY >= M) continue;
				if(!visited[nextX][nextY] && arrCopy[nextX][nextY]==0) {
					arrCopy[nextX][nextY] = 2;
					q.offer(new int[] {nextX, nextY});
				}
			}
		}
		
		int cnt=0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(arrCopy[i][j] == 0) cnt++;
			}
		}
		return cnt;
	}
}
