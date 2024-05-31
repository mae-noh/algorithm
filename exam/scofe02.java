package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class scofe02 {
	static boolean[] visited;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String s = br.readLine();
		int arr[] = new int[N+1];
		long dp[] = new long[N+1];
		dp[1] = 1;
		for(int i=1; i<=s.length(); i++) {
			arr[i] = s.charAt(i-1)-'0';
		}
		for(int i=2; i<=N; i++) {
			if(arr[i] == 0) continue;
			dp[i] = dp[i-1] + dp[i-2];
		}
		System.out.println(dp[N]);
	}
}
