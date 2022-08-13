package swea.ETC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class gravity {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int test=0; test<T; test++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int[][] room = new int[M][N];
			int[] cnt = new int[M];
			Arrays.fill(cnt, N);
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<N; j++) {
				int lastIdx = Integer.parseInt(st.nextToken());
				for(int i=M-1; i>=M-lastIdx; i--) {
					room[i][j] = 1;
					cnt[i]--;
				}
			}
			Arrays.sort(cnt);
//			for(int[] i : room) {
//				for(int a : i) {
//					System.out.print(a);
//				}
//				System.out.println();
//			}			
//			System.out.println(Arrays.toString(cnt));
			
			int max=0;
			for(int i=M-1; i>=0; i--) {
				if(cnt[i] == N) continue;
				max = cnt[i];
				break;
			}
			System.out.println(max);
		}
	}
}
