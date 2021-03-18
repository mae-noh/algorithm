package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj1707 {
	public static final int MAX = 200000;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int K = Integer.valueOf(br.readLine());
		ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
		Queue<Integer> q = new LinkedList<>();
		boolean[] group = new boolean[MAX + 1];
		boolean[] visited = new boolean[MAX + 1];
		StringTokenizer st;
		String result;
		for (int i = 0; i < K; i++) {
			st = new StringTokenizer(br.readLine());
			int V = Integer.valueOf(st.nextToken());
			int E = Integer.valueOf(st.nextToken());
			init(V, graph, group, visited);
			for (int j = 0; j < E; j++) {
				st = new StringTokenizer(br.readLine());
				int v1 = Integer.valueOf(st.nextToken());
				int v2 = Integer.valueOf(st.nextToken());
				graph.get(v1).add(v2);
				graph.get(v2).add(v1);
				
			}
			result = isBipartite(q, graph, group, visited, V) ? "YES" : "NO";
			bw.write(result + "\n");
		}
		bw.close();
	}

	private static void init(int V, ArrayList<ArrayList<Integer>> graph, boolean[] group, boolean[] visited) {
		graph.clear();
		for (int i = 0; i <= V; i++) {
			graph.add(new ArrayList<Integer>());
		}
		Arrays.fill(group, 0, V + 1, false);
		Arrays.fill(visited, 0, V + 1, false);
	}

	private static boolean isBipartite(Queue<Integer> q, ArrayList<ArrayList<Integer>> graph, boolean[] group, boolean[] visited, int V) {
		for (int i = 1; i <= V; i++) {
			if (!visited[i]) q.offer(i);

			while (!q.isEmpty()) {
				int curVertex = q.poll();
				if (visited[curVertex])	continue;
				visited[curVertex] = true;
				for (int j = 0; j < graph.get(curVertex).size(); j++) {
					int nextVertex = graph.get(curVertex).get(j);
					if (visited[nextVertex] && group[curVertex] == group[nextVertex]) return false;
					if (!visited[nextVertex]) {
						group[nextVertex] = !group[curVertex];
						q.offer(nextVertex);
					}
				}
			}
		}
		return true;
	}

}
