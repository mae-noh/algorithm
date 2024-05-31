package exam;

import java.util.ArrayList;
import java.util.List;

public class programmers03 {
	public static void main(String[] args) {
		int[] a = {-5,0,2,1,2};
		int[][] edges = {{0,1},{3,4},{2,3},{0,3}};
		solution(a, edges);
	}
	public static long solution(int[] a, int[][] edges) {
		// 트리를 다 순회하면서 값이 0 이되면 가능
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<a.length; i++) {
			list.add(new ArrayList<>(a[i]));
		}
		for(int i=0; i<edges.length; i++) {
			int[] edge = edges[i];
			list.get(edge[0]).add(edge[1]);
		}
		
		long answer = -1;
		
		return answer;
	}
}
