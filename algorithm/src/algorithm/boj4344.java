package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj4344 {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		int T=0;		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			String s = br.readLine();
			String[] score = s.split(" ");
			
			int sum=0;
			for(int j=1; j<score.length; j++) {
				sum += Integer.parseInt(score[j]);
			}
			double avg = (double)sum/Integer.parseInt(score[0]);
			
			int cnt=0;
			for(int j=1; j<score.length; j++) {
				if(Integer.parseInt(score[j]) > avg) {
					cnt++;
				}
			}
			System.out.printf("%5.3f%%\n", (double)cnt/Integer.parseInt(score[0])*100);
		}
	}

}
