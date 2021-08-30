package programmers;

import java.util.Arrays;

public class E08 {

	public static int[][] solution(int N, int[][] mine) {
		int[][] answer = new int[N][N];
		
		// 지뢰 채우기
		for(int i=0; i<mine.length; i++) {
			answer[mine[i][0]-1][mine[i][1]-1] = -1;
		}
		
		for(int i=0; i<N; i++) {
			System.out.println(Arrays.toString(answer[i]));
		}
		
		int[] dx = {-1, -1, -1, 0, 0, 0, 1, 1, 1};
		int[] dy = {-1, 0, 1, -1, 0, 1 ,-1, 0, 1};
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				int sum = 0;
				if(answer[i][j] == -1) continue;
				System.out.println(dy.length + " " + dx.length);
				for(int k=0; k<dx.length; k++) {
						int newX = i + dx[k];
						int newY = j + dy[k];
						if(newX < 0 || newX >= N || newY < 0 || newY >= N) continue;
						if(answer[newX][newY] == -1) {
							System.out.println(newX + " " + newY + " " + i + " " + j + " " + dx[k] + " " + dy[k] );
							sum++;
					}
				}
				answer[i][j] = sum;
			}
		}
		
		for(int i=0; i<N; i++) {
			System.out.println(Arrays.toString(answer[i]));
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		int[][] mine = {{1,1},{1,7},{2,7},{3,6},{4,1},{4,4},{4,8},{8,4},{8,5},{9,6}};
		solution(9, mine);
	}
	
}
