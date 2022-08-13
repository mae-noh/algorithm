package beakjoon.Mathematics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj1978 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.valueOf(br.readLine());
		String[] s = br.readLine().split(" ");
		int[] numbers = new int[N];
		for(int i=0; i<N; i++) {
			numbers[i] = Integer.valueOf(s[i]);
		}
		int cnt = 0;
		for(int i=0; i<N; i++) {
			int j = 0;
			for(j=2; j<numbers[i]; j++) {
				if(numbers[i]%j==0) break;
			}
			if(j == numbers[i]) cnt++;
		}
		bw.write(cnt+"");
		bw.close();
		br.close();
	}

}
