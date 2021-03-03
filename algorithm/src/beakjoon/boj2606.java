package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj2606 {

	public static boolean[] visited = new boolean[101];
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
	
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
			graph.get(Integer.valueOf(s[0])).add(Integer.valueOf(s[1]));
			graph.get(Integer.valueOf(s[1])).add(Integer.valueOf(s[0]));
		}
		System.out.println(countVirusPC(1)-1);
	}

	private static int countVirusPC(int v) {
		Queue<Integer> q = new LinkedList<>();
		visited[v] = true;
		q.add(v);
		
		int cnt=0;
		while(!q.isEmpty()) {
			int x = q.poll();
			cnt++;
			for(int i=0; i<graph.get(x).size(); i++) {
				int y=graph.get(x).get(i);
				if(!visited[y]) {
					visited[y] = true;
					q.add(y);
				}
			}
		}
		return cnt;
	}
	
}
