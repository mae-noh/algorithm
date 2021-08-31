package programmers;

import java.util.Arrays;

public class E12 {

	public static int solution(int[] estimates, int k) {
        int answer = 0;
        
        int[] sum = new int[estimates.length];
        int[] result = new int[estimates.length];        
        
        sum[0] = estimates[0];
        
        int max = 0;
        for(int i=1; i<estimates.length; i++) {
        		sum[i] = Math.max(0, sum[i-1]) + estimates[i];
        }
        
        for(int i=0; i<sum.length; i++) {
    		if(i>=k) result[i] = sum[i] - sum[i-k];
    		else result[i] = sum[i];
        }
        
        System.out.println(Arrays.toString(sum));
        System.out.println(Arrays.toString(result));
       
        answer = Arrays.stream(result).max().getAsInt();
        
        return answer;
    }
	
	public static void main(String[] args) {
		int k = 3;
		int[] estimates = {5, 1, 9, 8, 10, 5};
		
//		int k = 6;
//		int[] estimates = {10, 1, 10, 1, 1, 4, 3, 10};
		
		solution(estimates, k);
	}
}
