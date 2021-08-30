package programmers;

import java.util.Arrays;

public class E03 {

	public static int solution(int[] estimates, int k) {
        int answer = 0;
        
        int[] sum = new int[estimates.length];
        int[] memo = new int[estimates.length];

        sum[0] = estimates[0];

        int max = 0;
        for(int i=1; i<estimates.length-k+1; i++) {
        	for(int j=i; j<i+k; j++) {
        		sum[j] = Math.max(0, sum[j-1]) + estimates[j];
        		memo[j] = sum[j];
        		if(j>k) {
        			memo[j] = sum[j] - memo[j-k];
        			System.out.println(sum[j-1] + " " + memo[j-k] + " " + memo[j]);
        		}
        		System.out.println(Arrays.toString(sum));
        		System.out.println(Arrays.toString(memo) + " " + memo[j]);
        		max = max < memo[j] ? memo[j] : max;
        	}
        }

        answer = max;
        
        return answer;
    }
	
	public static void main(String[] args) {
	
		int[] estimates = {10, 1, 10, 1, 1, 4, 3, 10};
		int k = 6;

		System.out.println(solution(estimates, k));
	}
	
}
