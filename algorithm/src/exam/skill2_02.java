package exam;

import java.util.Arrays;

public class skill2_02 {

	public static void main(String[] args) {
		int[] scoville = { 1, 2, 3, 9, 10, 12 };
		int K = 7;
		System.out.println(solution(scoville, K));
	}

	public static int solution(int[] scoville, int K) {
		int answer = 0;

		while (true) {
			
			Arrays.sort(scoville);
			System.out.println(Arrays.toString(scoville));

			int first = scoville[0];
			int second = scoville[1];
			
			System.out.println(first + " " + second);
			
			if (first < K && second >= K) {
				answer = -1;
				break;
			}
			if (first >= K && second >= K) {
				break;
			}
					
			scoville[1] = K;			
			scoville[0] = first + second*2;
			
			answer++;
		}

		return answer;
	}

}
