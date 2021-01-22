package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj4344 {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		int T=0, N=0, sum=0, cnt=0;
		double avg=0;
		int[] score;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			score = new int[N];
			sum=0;
			cnt=0;
			for(int j=0; j<N; j++) {
				score[j] = Integer.parseInt(st.nextToken());
				sum += score[j];
			}
			avg = (double)sum/N;
			
			for(int j=0; j<N; j++) {
				if(score[j] > avg) {
					cnt++;
				}
			}

			System.out.printf("%5.3f%%\n", (double)cnt/N*100);
		}
	}

}
