package beakjoon;

import java.util.Scanner;

public class boj2003 {


	public static void main(String[] args) {

		// 입력 처리
		int N; // 길이
		long M;
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextLong();
		
		int A[] = new int[N];
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		
		// 로직
		// 포인터 2개 start, end
		// total < 5 : end++;
		// total > 5 : start++;
		// total == 5 : count++; start++; end++;		
		
		int total = 0;
		
		for(int i=0; i<N; i++) {
			
			for(int j=i; j<N; j++) {
				
			}
		}
				
	}
	
}
