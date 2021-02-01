package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj2775 {
	final static int N = 15;
	static int[][] count = new int[N+1][N+1];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.valueOf(br.readLine());
		for(int i=0; i<=N; i++) {
			count[1][i] = i;
		}
		for(int i=0; i<T; i++) {
			int k = Integer.valueOf(br.readLine());
			int n = Integer.valueOf(br.readLine());
			bw.write(countOfPerson(k,n)+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
	private static int countOfPerson(int k, int n) {
		for(int i=1; i<=k+1; i++) {
			for(int j=1; j<=n; j++) {
				if(count[i][j]>0 || i-1<0 || j-1<0) continue;
				count[i][j] = count[i-1][j] + count[i][j-1];
			}
		}
		return count[k+1][n];
	}
	
}
