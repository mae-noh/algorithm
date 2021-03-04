package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class boj2606 {

	public static boolean[] visited = new boolean[101];
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
	public static int cnt = -1;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s;
		int N = Integer.valueOf(br.readLine());
		for(int i=0; i<=N; i++) {
			graph.add(new ArrayList<Integer>());
		}
		int M = Integer.valueOf(br.readLine());
		for(int i=0; i<M; i++) {
			s = br.readLine().split(" ");
			int x = Integer.valueOf(s[0]);
			int y = Integer.valueOf(s[1]);
			graph.get(x).add(y);
			graph.get(y).add(x);
		}
		countVirusPC_DFS(1);
		System.out.println(cnt);
	}
	
	private static void countVirusPC_DFS(int v) {
		visited[v] = true;
		cnt++;
		for(int i=0; i<graph.get(v).size(); i++) {
			int y = graph.get(v).get(i);
			if(!visited[y]) countVirusPC_DFS(y);
		}
	}

//	private static int countVirusPC_BFS(int v) {
//		Queue<Integer> q = new LinkedList<>();
//		visited[v] = true;
//		q.offer(v);
//		
//		int cnt=-1;
//		while(!q.isEmpty()) {
//			int x = q.poll();
//			cnt++;
//			for(int i=0; i<graph.get(x).size(); i++) {
//				int y=graph.get(x).get(i);
//				if(!visited[y]) {
//					visited[y] = true;
//					q.offer(y);
//				}
//			}
//		}
//		return cnt;
//	}
	
}
