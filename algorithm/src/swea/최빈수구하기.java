package swea;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 최빈수구하기 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		int[] scores = new int[101];
		Arrays.toString(scores);
		StringTokenizer st;
		int maxIdx, max;
		for(int i=0; i<T; i++) {
			int testCase = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			max = maxIdx = 0;
			while(st.hasMoreTokens()) {
				int num = Integer.parseInt(st.nextToken());
				scores[num]++;
				if(max < scores[num] || max == scores[num] && maxIdx < num ) {
					max = scores[num];
					maxIdx = num;
				}
			}
			bw.write("#"+testCase+" "+maxIdx+"\n");
			Arrays.fill(scores, 0);
		}
		bw.close();
		br.close();
	}
	
}
