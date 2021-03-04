package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class boj2667 {
	
	public static boolean[][] visited;
	public static int[][] arr;
	public static int[] count;
	public static int cnt;
	public static int[] dx = {1,0,-1,0};
	public static int[] dy = {0,1,0,-1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.valueOf(br.readLine());
		visited = new boolean[N][N];
		arr = new int[N][N];
		for(int i=0; i<N; i++) {
			char[] tmp = br.readLine().toCharArray();
			for(int j=0; j<N; j++) {
				arr[i][j] = tmp[j]-'0';
			}
		}
		count = new int[N*N];
		cnt = 0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(!visited[i][j]) bfs(i, j);
			}
		}
		bw.write(cnt+"\n");
		Arrays.sort(count, 0, cnt);
		for(int i=0; i<cnt; i++) {
			bw.write(count[i]+"\n");
		}
		bw.close();
		br.close();
	}

	private static void bfs(int x, int y) {
		Queue<Position> q = new LinkedList<>();
		visited[x][y] = true;
		if(arr[x][y] == 0) return;
		q.add(new Position(x, y));

		while(!q.isEmpty()) {
			Position tmp = q.poll();
			count[cnt]++;
			for(int j=0; j<4; j++) {
				int tx = tmp.x+dx[j];
				int ty = tmp.y+dy[j];
				if(tx < 0 || ty < 0 || tx > arr.length-1 || ty > arr.length-1) continue;
				if(visited[tx][ty] || arr[tx][ty] == 0) continue;
				visited[tx][ty] = true;
				q.add(new Position(tx, ty));
			}
		}
		cnt++;
	}
	
}

//클래스명 중복
class Position2 {
	public Position2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	int x;
	int y;
}