package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class boj1260 {
	
	public static boolean[] visited = new boolean[1001];
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int N = Integer.valueOf(s[0]);
		int M = Integer.valueOf(s[1]);
		int V = Integer.valueOf(s[2]);
		for(int i=0; i<visited.length; i++) {
			graph.add(new ArrayList<Integer>());
		}
		for(int i=0; i<M; i++) {
			s = br.readLine().split(" ");
			graph.get(Integer.valueOf(s[0])).add(Integer.valueOf(s[1]));
			graph.get(Integer.valueOf(s[1])).add(Integer.valueOf(s[0]));
		}
		for(ArrayList<Integer> a : graph) {
			a.sort(Comparator.naturalOrder());
		}
		dfs(V);
		init();
		bfs(V);
	}

	private static void init() {
		visited = new boolean[1001];
		System.out.println("");
	}

	private static void bfs(int v) {
		Queue<Integer> q = new LinkedList<>();
		visited[v] = true;
		q.add(v);
		while(!q.isEmpty()) {
			int x = q.poll();
			System.out.print(x + " ");
			for(int i=0; i<graph.get(x).size(); i++) {
				int y=graph.get(x).get(i);
				if(!visited[y]) {
					visited[y] = true;
					q.add(y);
				}
			}
		}
	}

	private static void dfs(int v) {
		visited[v] = true;
		System.out.print(v + " ");
		for(int i=0; i<graph.get(v).size(); i++) {
			int y=graph.get(v).get(i);
			if(!visited[y]) dfs(y);
		}
	}
	
}
