package beakjoon.ETC;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class boj10818 {
	
	public static void main(String[] args) throws IOException {
		
		int N, min, max, tmp=0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		min = max = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<N-1; i++) {
			tmp = Integer.parseInt(st.nextToken());
			if(min > tmp) {
				min = tmp;
			}
			if(max < tmp) {
				max = tmp;
			}	
		}
		
		System.out.println(min + " ");
		
	}

}
