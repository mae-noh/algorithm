package programmers;

import java.util.HashMap;
import java.util.Map;

public class E06 {

	static final int MAX = 500000;
	static int MAX_COUNT = 0;

	public static void main(String[] args) {
		int[][] needs = { { 1, 0, 0 }, { 1, 1, 0 }, { 1, 1, 0 }, { 1, 0, 1 }, { 1, 1, 0 }, { 0, 1, 1 }, { 1, 0, 0 }, { 1, 1, 0 }, { 1, 1, 0 } };
		int r = 2;
				
		solution(needs, r);
	}
	

	public static int solution(int[][] needs, int r) {
		int answer = 0;
		
		boolean[] visited = new boolean[MAX + 1];
		
		Map<String,Integer> map = new HashMap<>();
		StringBuffer sb = new StringBuffer("");
		for(int i=0; i<needs.length; i++) {
			for(int j=needs[i].length-1; j>=0; j--) {
				sb.append(needs[i][j]);
			}
			String s = sb.toString();
			if(map.containsKey(s)) map.put(s, map.get(s).intValue()+1);
			else map.put(s, 1);
		}
		
		
//		int n = 0;
//		for(int i=0; i<count.length; i++) {
//			if(count[i] != 0) n++;
//		}
//		combination(count, visited, 0, n, r);
//		System.out.println(MAX_COUNT);
		
		return answer;
	}
	
	static int sum(int[] arr, boolean[] visited, int n) {
		int sum = 0;
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                System.out.print(i + " ");
                sum += arr[i];
            }
        }
        return sum;
    }
	
	static void combination(int[] arr, boolean[] visited, int start, int n, int r) {
	    if(r == 0) {
	    	int sum = sum(arr, visited, n);
	    	System.out.println(" - " + sum + " max-count " + MAX_COUNT);
            MAX_COUNT = MAX_COUNT < sum ? sum : MAX_COUNT;
	        return;
	    } 

	    for(int i=start; i<arr.length; i++) {
	        if(arr[i] == 0) continue;
	        visited[i] = true;
	        combination(arr, visited, i + 1, n, r - 1);
	        visited[i] = false;
	    }
	}

}
