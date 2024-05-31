package programmers;

public class E01 {
	public static int solution(int[][] office, int k) {
		int answer = -1;
		
		int max = 0;
		
		for (int i = 0; i < office.length; i++) {
			for (int j = 0; j < office[0].length; j++) {
				int sum = 0;
				for(int l = i; l < i + k; l++) {
					for(int m = j; m < j + k; m++) {						
						if(l < 0 || m < 0 || l >= office.length || m >= office[0].length) continue;
						sum += office[l][m];
					}
				}
				max = max < sum ? sum : max;
			}
		}
		
		answer = max;

		return answer;
	}

	public static void main(String[] args) {
		int[][] office = { { 1, 0, 0, 0 }, { 0, 0, 0, 1 }, { 0, 0, 1, 0 }, { 0, 1, 1, 0 } };
		int k = 2;

		System.out.println(solution(office, k));
	}
}
