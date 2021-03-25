package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1208 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] boxes = new int[100];
		StringTokenizer st;
		for(int i=1; i<=10; i++) {
			int N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<100; j++) {
				boxes[j] = Integer.parseInt(st.nextToken());
			}
			for(int j=0; j<N; j++) {
				Arrays.sort(boxes);
				boxes[99]--;
				boxes[0]++;
			}
			Arrays.sort(boxes);
			int diff = boxes[99] - boxes[0];
			System.out.println("#"+i+" "+diff);
		}
	}	
}
