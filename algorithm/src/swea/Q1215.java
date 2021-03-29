package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1215 {
	static char[][] arr;
	static final int MAX=8;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int testCase=1; testCase<=10; testCase++) {
			int N = Integer.parseInt(br.readLine());
			String s;
			arr = new char[MAX][MAX];
			for(int i=0; i<MAX; i++) {
				arr[i] = br.readLine().toCharArray();
			}
			
			int cnt=0;
			for(int i=0; i<MAX; i++) {
				for(int j=0; j<=MAX-N; j++) {
					int rowCount=0, columnCount=0;
					for(int k=0; k<N/2; k++) {
						if(arr[i][j+k] == arr[i][j+N-k-1]) rowCount++;
						if(arr[j+k][i] == arr[j+N-k-1][i]) columnCount++;
					}
					if(rowCount==N/2) cnt++;
					if(columnCount==N/2) cnt++;
				}
			}
			System.out.println("#"+testCase+" "+cnt);
		}
	}
}
