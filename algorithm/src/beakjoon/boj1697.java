package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj1697 {
	public static boolean[] visited;
	public static int[] dx = {2,1,-1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int K = Integer.valueOf(st.nextToken());
		int MAX = N < K ? K : N;
		int[] arr = new int[2*(MAX+1)];
		visited = new boolean[2*(MAX+1)];
		hideAndSeek(N,MAX,arr);
		bw.write(arr[MAX]+"");
		bw.close();
	}
	
	private static void hideAndSeek(int N,int MAX,int[] arr) {
		Queue<Integer> q = new LinkedList<>();
		visited[N] = true;
		q.offer(N);
		while(!q.isEmpty()) {
			int tmp = q.poll();
			for(int i=0; i<3; i++) {
				int tx = dx[i]<2 ? tmp+dx[i] : tmp*dx[i];
				if(tx < 0 || tx > MAX*2) break;
				if(!visited[tx]) {
					arr[tx] = arr[tmp]+1;
					q.add(tx);
					visited[tx] = true;
				}
			}
		}
	}
}
