package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1210 {
	static final int MAX = 100;
	static int[][] ladder = new int[MAX][MAX];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		for(int test_case=1; test_case<=10; test_case++) {
			int N = Integer.parseInt(br.readLine());
			for(int i=0; i<MAX; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0; j<MAX; j++) {
					ladder[j][i] = Integer.parseInt(st.nextToken());
				}
			}
			int result=-1;
			for(int i=0; i<MAX; i++) {
				if(ladder[i][0]==1) {
					result = bfs(i);
					if(result > -1) {
						System.out.println("#"+test_case+" "+result);
						break;
					}
				}
			}
		}
	}

	private static int bfs(int v) {
		Queue<int[]> q = new LinkedList<>();
		boolean[][] visited = new boolean[MAX][MAX];
		q.offer(new int[] {v,0});
		
		while(!q.isEmpty()) {
			int[] curV = q.poll();
			int x = curV[0];
			int y = curV[1];
			visited[x][y] = true;
			if(ladder[x][y] == 2) return v;
			if(x+1 < MAX && !visited[x+1][y] && ladder[x+1][y]>=1) q.offer(new int[] {x+1,y});
			else if(x-1>=0 && !visited[x-1][y] && ladder[x-1][y]>=1) q.offer(new int[] {x-1,y});
			else if(y+1>=0 && y+1<MAX && !visited[x][y+1] && ladder[x][y+1]>=1) q.offer(new int[] {x,y+1});
		}
		return -1;
	}
	
}
