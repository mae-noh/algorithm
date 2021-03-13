package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj2206 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		int[][] board = new int[N][M];
		boolean[][][] visited = null;
		for(int i=0; i<N; i++) {
			char[] tmp = br.readLine().toCharArray();
			for(int j=0; j<M; j++) {
				board[i][j] = tmp[j]-'0';
			}
		}
//		int result = 0, max = 0;
//		for(int i=0; i<=1; i++) {
//			result=bfs(i, N, M, board, visited);
//			if(max < result) max = result;
//		}
//		max = max > 0 ? max+1 : -1;
		int max = bfs(0, N, M, board, visited);
		bw.write(max+"");
		bw.close();
	}

	private static int bfs(int wall, int N, int M, int[][] board, boolean[][] visited) {
		int[] dx = {1,0,-1,0};
		int[] dy = {0,1,0,-1};
		visited = new boolean[N][M];
		Queue<int[]> q = new LinkedList<>();
		visited[0][0] = true;
		q.offer(new int[]{0,0,0});
		
		while(!q.isEmpty()) {
			int[] curPos = q.poll();
			for(int i=0; i<dx.length; i++) {
				int nextRow = curPos[0] + dx[i];
				int nextCol = curPos[1] + dy[i];
				if(nextRow < 0 || nextCol < 0 || nextRow >= N || nextCol >= M) continue;
				int nextWall = curPos[2] + board[nextRow][nextCol];
				if(nextWall >= wall+1) continue;
				
				if(!visited[nextRow][nextCol] && board[nextRow][nextCol]<=1) {
					visited[nextRow][nextCol] = true;
					q.offer(new int[] {nextRow, nextCol, nextWall});
					board[nextRow][nextCol] = board[curPos[0]][curPos[1]]+1;
				}
			}
		}
		return board[N-1][M-1];
	}
}
