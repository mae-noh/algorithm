package swea.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1211_dfs {
	static final int MAX = 100;
	static int[][] ladder = new int[MAX][MAX];
	static boolean[][] visited;
	static int min;
	static int minIdx;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		for(int testCase=1; testCase<=10; testCase++) {
			br.readLine();
			for(int i=0; i<MAX; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0; j<MAX; j++) {
					ladder[i][j] = Integer.parseInt(st.nextToken()); 
				}
			}
			min = 10000;
			minIdx = 100;
			for(int i=0; i<MAX; i++) {
				if(ladder[0][i] == 1) {
					visited = new boolean[MAX][MAX];
					dfs(i, 0, i, 1);
				}
			}
			System.out.println("#"+testCase+" "+minIdx);
		}
	}
	
	private static void dfs(int v, int x, int y, int distance) {		
		
		visited[x][y] = true;
		
		if(x==99) {
			if(min >= distance) {
				min = distance;
				minIdx = v;
			}		
			return;
		}
		//System.out.println(v + " " + x + " " + y + " " + distance);
		if(y+1<MAX && !visited[x][y+1] && ladder[x][y+1]==1) dfs(v, x, y+1, distance+1);
		else if(y-1>=0 && !visited[x][y-1] && ladder[x][y-1]==1) dfs(v, x, y-1, distance+1);
		else if(!visited[x+1][y] && ladder[x+1][y]==1) dfs(v, x+1, y, distance+1);
		
	}
}
