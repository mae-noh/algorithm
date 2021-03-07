package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class boj2178 {

	
	public static int[][] board;
	public static int[] dx = {-1,0,1,0};
	public static int[] dy = {0,-1,0,1};	
	public static int N, M;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		N = Integer.parseInt(s[0]);
		M = Integer.parseInt(s[1]);
		board = new int[N+2][M+2];
		for(int i=1; i<=N; i++) {
			s = br.readLine().split("");
			for(int j=1; j<=M; j++) {
				board[i][j] = Integer.parseInt(s[j-1]);
			}
		}
		bfs(1,1);
		bw.write(board[N][M]+"");
		bw.close();
	}

	private static void bfs(int x, int y) {
		Queue<Position> q= new LinkedList<>();
		q.offer(new Position(x,y));
		
		while(!q.isEmpty()) {
			Position tmp = q.poll();
			for(int i=0; i<4; i++) {
				int tx = tmp.x + dx[i];
				int ty = tmp.y + dy[i];
				if(board[tx][ty] == 1) {
					q.offer(new Position(tx, ty));
					board[tx][ty]= board[tmp.x][tmp.y]+1;
				}
			}
		}
		
	}
	
}

class Position{
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}
	int x;
	int y;
}
