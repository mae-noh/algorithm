package swea;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class 최빈수구하기 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int i=0; i<T; i++) {
			int testCase = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			int[] scores = new int[101];
			while(st.hasMoreTokens()) {
				int num = Integer.parseInt(st.nextToken());
				scores[num]++;
			}
			int max = 0;
			for(int data : scores) {
				if(max < data) max = data;
			}
			int maxIdx = 0;
			Stack<Integer> stack = new Stack<>();
			for(int j=1; j<=100; j++) {
				if(scores[j] == max) stack.push(j);
			}		
			bw.write("#"+testCase+" "+stack.pop()+"\n");
		}
		bw.close();
		br.close();
	}
	
}
