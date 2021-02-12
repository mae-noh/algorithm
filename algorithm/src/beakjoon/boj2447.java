package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj2447 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.valueOf(br.readLine());
		String[][] arr = new String[N][N];
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				arr[i][j] = "*";
			}
		}
		recur(arr, N, N/3, 0, 0);
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				bw.write(arr[i][j]);
			}
			bw.newLine();
		}
		bw.close();
		br.close();
	}

	private static void recur(String[][] arr, int n, int r, int x, int y) {
		if(r < 1) return;
		for(int i=x+n/3; i<x+n/3+r; i++) {
			for(int j=y+n/3; j<y+n/3+r; j++) {
				arr[i][j] = " ";
			}
		}
		for(int i=x; i<x+n; i+=r) {
			for(int j=y; j<y+n; j+=r) {
				recur(arr, n/3, r/3, i, j);
			}
		}
	}
}
