package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj7576 {
	
	public static boolean[][] visited;
	public static ArrayList<ArrayList<String>> tomatoField = new ArrayList<ArrayList<String>>();
	public static int[] dx = {1,0,-1,0};
	public static int[] dy = {0,1,0,-1};
	public static int M, N;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.valueOf(st.nextToken());
		N = Integer.valueOf(st.nextToken());
		visited = new boolean[N][M];
		for(int i=0; i<N; i++) {
			tomatoField.add(new ArrayList<String>());
		}
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++) {
				tomatoField.get(i).add(st.nextToken());
			}
		}
		int zero=0;
		for(ArrayList<String> i : tomatoField) {
			if(i.contains("0")) zero++;
		}
		if(zero == 0) {
			bw.write(0+"");
			bw.close();
			return;
		}
		
		int result=0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				String v = tomatoField.get(i).get(j);
				if(v.equals("1") && !visited[i][j]) {
					int val = bfs(i,j);
					result = result < val ? val : result;
				}
			}
		}
		
		for(ArrayList<String> i : tomatoField) {
			if(i.contains("0")) {
				result = -1;
				break;
			}			
		}
		bw.write(result+"");
		bw.close();
		
	}

	private static int bfs(int x, int y) {
		int cnt=-1;
		Queue<Position> q = new LinkedList<>();
		q.offer(new Position(x,y));
		visited[x][y] = true;
		
		while(!q.isEmpty()) {
			Position tmp = q.poll();
			cnt++;
			System.out.println(tmp.x + " " + tmp.y);
			for(int i=0; i<4; i++) {
				int tx = tmp.x + dx[i];
				int ty = tmp.y + dy[i];
				System.out.println(tx + " " + ty);
				if(tx < 0 || ty < 0 || tx >= N || ty >= M) continue;
				if(tomatoField.get(tx).get(ty).equals("0") && !visited[tx][ty]) {
					visited[tx][ty] = true;
					tomatoField.get(tx).set(ty, "1");
					q.offer(new Position(tx, ty));
				}
			}
		}
		return cnt;
	}
	
}

class Position {
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}
	int x;
	int y;
}