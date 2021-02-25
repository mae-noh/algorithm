package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj1931 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.valueOf(br.readLine());
		int[][] arr = new int[N][2];
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.valueOf(st.nextToken());
			arr[i][1] = Integer.valueOf(st.nextToken());
		}
		Arrays.sort(arr, (a,b)->{
			if(a[1]==b[1]) return a[0]-b[0];
			else return a[1]-b[1];
		});
		int cnt=1;
		int i=0;
		for(int j=1; j<N; j++) {
				if(arr[i][1] > arr[j][0]) continue;
				i = j;
				cnt++;
		}
		System.out.println(cnt);
	}
}
