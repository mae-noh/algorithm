package programmers;

import java.util.Arrays;

public class E02 {

	public static int[] solution(int[] price) {
		int[] answer = new int[price.length];
		
		for(int i=0; i<answer.length; i++) {
			answer[i] = -1;
		}
		
		int start = 0;
		int end = 1;
		
		int result = 0;
		
		int i=0;
		while(true) {
			if(end > price.length-1 && start > price.length-1) break;
			
			result = price[end] - price[start];
			
			if(result > 0) {
				answer[start] = end - start;
				end = ++start;
			}
			
			if(result <= 0) {
				end++;
			}
		}	
		
		return answer;
	}

	public static void main(String[] args) {
		int[] price = {4,1,4,7,6};
		System.out.println(Arrays.toString(solution(price)));
	}

}
