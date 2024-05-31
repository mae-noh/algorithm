package beakjoon.Backtracking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class boj7562 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int testCase = Integer.valueOf(br.readLine());
		for(int i=0; i<testCase; i++) {
			int len = Integer.valueOf(br.readLine());
			String[] start = br.readLine().split(" ");
			String[] dest = br.readLine().split(" ");
			bw.write(bfs(len, Integer.valueOf(start[0]), Integer.valueOf(start[1]), Integer.valueOf(dest[0]), Integer.valueOf(dest[1]))+"\n");
		}
		bw.close();
		br.close();
	}
	
	public static int bfs(int N, int startX, int startY, int destX, int destY) {
		int[] dx = {1,-1,2,-2,-1,-2,1,2};
		int[] dy = {2,2,1,1,-2,-1,-2,-1};
		int[][] board = new int[N][N];
		boolean[][] visited = new boolean[N][N];
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] {startX, startY});
		
		while(!q.isEmpty()) {
			int[] curPos = q.poll();
			if(curPos[0] == destX && curPos[1] == destY) break;
			for(int i=0; i<dx.length; i++) {
				int nextX = curPos[0] + dx[i];
				int nextY = curPos[1] + dy[i];
				if(nextX < 0 || nextY < 0 || nextX >= N || nextY >= N) continue;
				if(!visited[nextX][nextY]) {
					visited[nextX][nextY] = true;
					board[nextX][nextY] = board[curPos[0]][curPos[1]] + 1;
					q.offer(new int[] {nextX, nextY});
				}
			}
		}
		
		return board[destX][destY];
	}
}
