package exam;

public class programmers2_01 {

	public static void main(String[] args) {
		int left = 13;
		int right = 17;
		
		System.out.println(solution(left, right));
	}
	
	public static int solution(int left, int right) {
		int answer = 0;
		
		for(int i=left; i<=right; i++) {
			int cnt = count(i);
			if(cnt%2==0) answer+=i;
			if(cnt%2!=0) answer-=i;
		}
		
		return answer;
	}

	private static int count(int num) {
		int cnt=0;
		
		for(int i=1; i<=num; i++) {
			if(num%i==0) cnt++;
		}
		
		return cnt;
	}
}
