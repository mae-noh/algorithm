package swea.ETC;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1206 {
	public static void main(String[] args) throws Exception {
		int[] buildings = new int[1000];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		for(int i=1; i<=10; i++) {
			int N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<N; j++) {
				buildings[j] = Integer.parseInt(st.nextToken());
			}
			int cnt=0;
			for(int j=2; j<N-2; j++) {
				int tmp = buildings[j] - Math.max(Math.max(buildings[j-1], buildings[j-2]), Math.max(buildings[j+1], buildings[j+2]));
				cnt += tmp > 0 ? tmp : 0;
			}
			System.out.println("#"+i+" "+cnt);
		}
	}
}
