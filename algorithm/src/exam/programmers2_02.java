package exam;

public class programmers2_02 {

	public static void main(String[] args) {
		
		long[] numbers = {2,7};

		long[] answer = solution(numbers);
		
		for(int i=0; i<answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
	}
	
	public static long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        
        for(int i=0; i<numbers.length; i++) {
        	answer[i] = min(numbers[i]);
        }
        
        return answer;
    }

	private static long min(long number) {
		long num = number+1;
		
		while(true) {
			long tmp = (number ^ num);
			if(count(tmp)<=2) return num;
			num++;
		}
	}

	private static int count(long tmp) {
		String s = Long.toBinaryString(tmp);
		int cnt=0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == '1') cnt++;
		}
		return cnt;
	}

	
}
