package exam;

import java.util.ArrayList;

public class kakao02 {
	static int result;
	public static void main(String[] args) {
		int r = 2;
		int[][] needs = { { 1, 0, 0 }, { 1, 1, 0 }, { 1, 1, 0 }, { 1, 0, 1 }, { 1, 1, 0 }, {0, 1, 1} };
		System.out.println(solution(needs, r));
	}
	public static int solution(int[][] needs, int r) {
		boolean[] visited = new boolean[15];
		ArrayList<Integer> arr = new ArrayList<>();
		dfs(r, r, visited, arr, needs, needs.length);
		return result;
	}
	private static void dfs(int d, int r, boolean[] visited, ArrayList<Integer> arr, int[][] needs, int max) {
		if(d == 0) {
			for(int i=0; i<needs.length; i++) {
				for(int j=0; j<needs[i].length; j++) {
					if(needs[i][j]==1 && !arr.contains(j)) {
						max--;
						break;
					}
				}
			}
			if(result < max) result = max;
			return;
		}
		for(int i=0; i<15; i++) {
			if(!visited[i]) {
				visited[i] = true;
				arr.add(i);
				dfs(d-1, r, visited, arr, needs, max);
				arr.remove(arr.size()-1);
				visited[i] = false;
			}
		}
	}
}


