package beakjoon.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj11047 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int K = Integer.valueOf(st.nextToken());
		int[] coins = new int[N];
		for(int i=0; i<N; i++) {
			coins[i] = Integer.valueOf(br.readLine());
		}
		int cnt=0;

		for(int i=N-1; i>=0; i--) {
			if(K==0) break;
			if(K-coins[i]<0) 
			K-=coins[i++];
			cnt++;
		}
		System.out.println(cnt);
		br.close();
	}
	
}
