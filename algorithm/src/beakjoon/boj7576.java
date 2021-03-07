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
	
	public static ArrayList<ArrayList<Integer>> tomatoField = new ArrayList<ArrayList<Integer>>();
	public static Queue<Position4> q = new LinkedList<>();
	public static int[] dx = {1,0,-1,0};
	public static int[] dy = {0,1,0,-1};
	public static int M, N;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.valueOf(st.nextToken());
		N = Integer.valueOf(st.nextToken());
		int zero=0;
		for(int i=0; i<N; i++) {
			tomatoField.add(new ArrayList<Integer>());
		}
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++) {
				int v = Integer.valueOf(st.nextToken());
				tomatoField.get(i).add(v);
				if(v==1) q.offer(new Position4(i,j));
				if(v==0) zero++;
			}
		}
		
		if(zero == 0) {
			bw.write(0+"");
			bw.close();
			return;
		}
		
		for(ArrayList<Integer> i : tomatoField) {
			for(Integer j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		bfs();
		for(ArrayList<Integer> i : tomatoField) {
			for(Integer j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		int result=0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				int v = tomatoField.get(i).get(j);
				if(v==0) {
					bw.write(-1+"");
					bw.close();
					return;
				}
				if(result < v) {
					result = v;
				}
			}
		}
		bw.write(result-1+"");
		bw.close();
		
	}

	private static void bfs() {
		while(!q.isEmpty()) {
			Position4 tmp = q.poll();
			int v = tomatoField.get(tmp.x).get(tmp.y);
			
			for(int i=0; i<4; i++) {
				int tx = tmp.x + dx[i];
				int ty = tmp.y + dy[i];
				if(tx < 0 || ty < 0 || tx >= N || ty >= M) continue;
				if(tomatoField.get(tx).get(ty)==0) {
					tomatoField.get(tx).set(ty, v+1);
					q.offer(new Position4(tx, ty));
				}
			}
		}
	}
	
}

class Position4 {
	public Position4(int x, int y) {
		this.x = x;
		this.y = y;
	}
	int x;
	int y;
}