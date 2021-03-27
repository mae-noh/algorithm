package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1211 {
	static final int MAX = 100;
	static int[][] arr = new int[MAX][MAX];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int test_case=1; test_case<=10; test_case++) {
			int N = Integer.parseInt(br.readLine());
			StringTokenizer st;
			for(int i=0; i<MAX; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0; j<MAX; j++) {
					arr[j][i] = Integer.parseInt(st.nextToken());
				}
			}
			int min=1000000, minIdx=100;
			for(int i=0; i<MAX; i++) {
				if(arr[i][0]==1) {
					int result = bfs(i);
					if(result == -1 || min < result) continue;
					min = result;
					minIdx = i;
				}
			}
			System.out.println("#"+test_case+" "+minIdx);
		}		
	}
	private static int bfs(int v) {
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[]{v,0});
		boolean[][] visited = new boolean[MAX][MAX];
		int[][] distance = new int[MAX][MAX];
		distance[v][0] = 1;
		
		while(!q.isEmpty()) {
			int[] curPos = q.poll();
			int x = curPos[0];
			int y = curPos[1];
			visited[x][y] = true;
			
			if(y == 99) return distance[x][y];
			
			if(x+1<MAX && !visited[x+1][y] && arr[x+1][y]>=1) {
				q.offer(new int[] {x+1, y});
				distance[x+1][y] = distance[x][y]+1;
			}
			else if(x-1>=0 && !visited[x-1][y] && arr[x-1][y]>=1) {
				q.offer(new int[] {x-1, y});
				distance[x-1][y] = distance[x][y]+1;
			}
			else if(y+1<MAX && !visited[x][y+1] && arr[x][y+1]>=1) {
				q.offer(new int[] {x, y+1});
				distance[x][y+1] = distance[x][y]+1;
			}
		}
		
		return -1;
	}
}
