package exam;

import java.util.Arrays;

public class skill2_02 {

	public static void main(String[] args) {
		int[] numbers = {2,1,3,4,1};
		
		System.out.println(Arrays.toString(solution(numbers)));
	}
	
	public static int[] solution(int[] numbers) {
        int[] answer = {};
        int MAX = 200 + 1;
        
        boolean[] num = new boolean[MAX+1];
        int count=0;

        
        for(int i=0; i<numbers.length; i++) {
        	for(int j=0; j<numbers.length && i!=j; j++) {
        		int sum = numbers[i]+numbers[j];
        		if(num[sum]) continue;
        		num[sum] = true;
    			count++;
        	}
        }
        
        int j=0;
        answer = new int[count];
        
        for(int i=0; i<MAX; i++) {
        	if(num[i]) {
        		answer[j++] = i;
        	}
        }
        
        return answer;
    }
	
}
