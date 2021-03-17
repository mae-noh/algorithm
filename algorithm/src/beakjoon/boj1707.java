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
	public static final int MAX = 10;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int K = Integer.valueOf(br.readLine());
		StringTokenizer st;
		ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
		Queue<Integer> q = new LinkedList<>();
		boolean[] group = new boolean[MAX + 1];
		boolean[] visited = new boolean[MAX + 1];
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
			String result = isBipartite(q, graph, group, visited, V) ? "YES" : "NO";
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
		for (int j = 1; j <= V; j++) {
			if (!visited[j]) q.offer(j);

			while (!q.isEmpty()) {
				//System.out.println(q.toString());
				int curVertex = q.poll();
				if (visited[curVertex])	continue;
				visited[curVertex] = true;
				for (int i = 0; i < graph.get(curVertex).size(); i++) {
					int nextVertex = graph.get(curVertex).get(i);
					//System.out.println(curVertex + " " + nextVertex);
//					System.out.println(Arrays.toString(group));
					// 만약 그룹이 같다면 이분그래프가 될수 없음.
					if (visited[nextVertex] && group[curVertex] == group[nextVertex])
						return false;
					// 방문 안한 곳이면? 현재 정점의 반대 그룹을 넣어줌.
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
