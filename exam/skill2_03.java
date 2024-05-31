package exam;

import java.util.Arrays;

public class skill2_03 {

	public static void main(String[] args) {

		int[][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
		System.out.println(solution(land));
		
	}

	public static int solution(int[][] land) {
		int answer = 0;
		
		int lenOfcol = land.length;
		int lenOfrow = land[0].length;
		
		for(int i=1; i<lenOfcol; i++) {
			for(int j=0; j<lenOfrow; j++) {
				int max = 0;
				for(int k=0; k<lenOfrow; k++) {
					if(k == j) continue;
					int cur = land[i][j];
					max = max < cur + land[i-1][k] ? cur + land[i-1][k] : max;
				}
				land[i][j] = max;
			}
		}
		
		int max = 0;		
		for(int i=0; i<lenOfrow; i++) {
			max = max < land[lenOfcol-1][i] ? land[lenOfcol-1][i] : max;
		}
		
		answer = max;		

		return answer;
	}

}
