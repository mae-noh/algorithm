package beakjoon.Backtracking;
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
		int[][][] distance = new int[N][M][2];
		for(int i=0; i<N; i++) {
			char[] tmp = br.readLine().toCharArray();
			for(int j=0; j<M; j++) {
				board[i][j] = tmp[j]-'0';
			}
		}
		bfs(N, M, board, distance);
		int max = distance[N-1][M-1][0] > distance[N-1][M-1][1] ? distance[N-1][M-1][0] : distance[N-1][M-1][1];
		int result = max == 0 ? -1 : max;
		bw.write(result+"");
		bw.close();
	}

	private static void bfs(int N, int M, int[][] board, int[][][] distance) {
		int[] dx = {1,0,-1,0};
		int[] dy = {0,1,0,-1};
		Queue<int[]> q = new LinkedList<>();
		distance[0][0][0] = 1;
		q.offer(new int[]{0,0,0});
		while(!q.isEmpty()) {
			int[] curPos = q.poll();
			if(curPos[0]==N-1 && curPos[1]==M-1) break;
			for(int i=0; i<dx.length; i++) {
				int nextRow = curPos[0] + dx[i];
				int nextCol = curPos[1] + dy[i];
				if(nextRow < 0 || nextCol < 0 || nextRow >= N || nextCol >= M) continue;
				int nextWall = curPos[2] + board[nextRow][nextCol];
				if(nextWall >= 2) continue;
				if(distance[nextRow][nextCol][nextWall]==0 && (board[nextRow][nextCol] == 0 || board[nextRow][nextCol] == 1)) {
					distance[nextRow][nextCol][nextWall] = distance[curPos[0]][curPos[1]][curPos[2]] + 1;
					q.offer(new int[]{nextRow, nextCol, nextWall});
				}
			}
		}
	}
}