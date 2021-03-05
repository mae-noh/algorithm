package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class boj1012 {
	public static final int MAX = 50;
	public static boolean[][] visited = new boolean[MAX][MAX];
	public static int[][] cabbageField = new int[MAX][MAX];
	public static int[] dx = {1,0,-1,0};
	public static int[] dy = {0,1,0,-1};
	public static int M,N,cnt;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.valueOf(br.readLine());
		while(T>0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			M = Integer.valueOf(st.nextToken());
			N = Integer.valueOf(st.nextToken());
			int K = Integer.valueOf(st.nextToken());
			init();
			for(int i=0; i<K; i++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.valueOf(st.nextToken());
				int y = Integer.valueOf(st.nextToken());
				cabbageField[x][y]=1;
			}
			for(int i=0; i<M; i++) {
				for(int j=0; j<N; j++) {
					if(!visited[i][j]) bfs(i, j);
				}
			}
			bw.write(cnt+"\n");
			T--;
		}
		bw.close();
		br.close();
	}

	private static void bfs(int x, int y) {
		Queue<Position3> q = new LinkedList<>();
		q.offer(new Position3(x,y));
		visited[x][y] = true;
		if(cabbageField[x][y] == 0) return;
		
		while(!q.isEmpty()) {
			Position3 tmp = q.poll();
			for(int i=0; i<4; i++) {
				int tx = tmp.x + dx[i];
				int ty = tmp.y + dy[i];
				if(tx < 0 || ty < 0 || tx >= M || ty >= N) continue;
				if(visited[tx][ty] || cabbageField[tx][ty]==0) continue;
				visited[tx][ty] = true;
				q.offer(new Position3(tx, ty));
			}
		}
		cnt++;
	}

	private static void init() {
		for(int[] i : cabbageField) {
			Arrays.fill(i, 0);
		}
		for(boolean[] i : visited) {
			Arrays.fill(i, false);
		}
		cnt=0;
	}
	
}

class Position3{
	public Position3(int x, int y) {
		this.x = x;
		this.y = y;
	}
	int x;
	int y;
}
