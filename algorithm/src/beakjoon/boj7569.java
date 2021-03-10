package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj7569 {

	public static Queue<int[]> q = new LinkedList<>();
	public static int[][][] tomatoField;
	public static int N,M,H;
	public static int[] dx = {1,0,-1,0,0,0};
	public static int[] dy = {0,1,0,-1,0,0};
	public static int[] dz = {0,0,0,0,-1,1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer s = new StringTokenizer(br.readLine());
		N = Integer.valueOf(s.nextToken());
		M = Integer.valueOf(s.nextToken());
		H = Integer.valueOf(s.nextToken());
		tomatoField = new int[H][M][N];
		int zeroCount=0;
		for(int i=0; i<H; i++) {
			for(int j=0; j<M; j++) {
				s = new StringTokenizer(br.readLine());
				for(int k=0; k<N; k++) {
					int tmp = Integer.valueOf(s.nextToken());
					tomatoField[i][j][k] = tmp;
					if(tmp == 1) q.offer(new int[] {i,j,k});
					if(tmp == 0) zeroCount++;
				}
			}
		}
		if(zeroCount == 0) {
			bw.write("0");
			bw.close();
			return;
		}
		
		bfs();
		
		int result=0;
		for(int i=0; i<H; i++) {
			for(int j=0; j<M; j++) {
				for(int k=0; k<N; k++) {
					int v = tomatoField[i][j][k];
					if(v==0) {
						bw.write("-1");
						bw.close();
						return;
					}
					if(result < v) {
						result = v;
					}
				}
			}
		}
		bw.write(result-1+"");
		bw.close();
		
	}

	private static void bfs() {
		while(!q.isEmpty()) {
			int[] tmp = q.poll();
			int v = tomatoField[tmp[0]][tmp[1]][tmp[2]];
			
			for(int i=0; i<6; i++) {
				int tz = tmp[0] + dz[i];
				int ty = tmp[1] + dy[i];
				int tx = tmp[2] + dx[i];
				System.out.println(dz[i] + " " + dy[i] + " " + dx[i]);
				if(tx < 0 || ty < 0 || tz < 0 || tx >= N || ty >= M || tz >= H) continue;
				if(tomatoField[tz][ty][tx] == 0) {
					tomatoField[tz][ty][tx] = v+1;
					q.offer(new int[] {tz,ty,tx});
				}
			}
		}
	}
	
}
