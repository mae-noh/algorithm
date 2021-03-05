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
	public static ArrayList<ArrayList<Integer>> tomatoField = new ArrayList<ArrayList<Integer>>();
	public static int[] dx = {1,0,-1,0};
	public static int[] dy = {0,1,0,-1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.valueOf(st.nextToken());
		int N = Integer.valueOf(st.nextToken());
		visited = new boolean[N][M];
		for(int i=0; i<N; i++) {
			tomatoField.add(new ArrayList<Integer>());
		}
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++) {
				tomatoField.get(i).add(Integer.valueOf(st.nextToken()));
			}
		}
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				int v = tomatoField.get(i).get(j);
				if(v==1) bfs(i,j);
			}
		}
	}

	private static void bfs(int x, int y) {
		Queue<Position> q = new LinkedList<>();
		q.offer(new Position(x,y));
		visited[x][y] = true;
		
		while(!q.isEmpty()) {
			for(int i=0; i<4; i++) {
				
			}
		}
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