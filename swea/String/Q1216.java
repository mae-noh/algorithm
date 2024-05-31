package swea.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1216 {
	static final int MAX=100;
	static char[][] arr = new char[MAX][MAX];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int testCase=1; testCase<=1; testCase++) {
			br.readLine();
			for(int i=0; i<MAX; i++) {
				arr[i] = br.readLine().toCharArray();
			}
			System.out.println("#"+testCase+" "+isPalindrome());
		}
	}
	private static int isPalindrome() {
		for(int max=MAX-1; max>=0; max--) {
			for(int i=0; i<MAX; i++) {
				for(int j=0; j<=MAX-max; j++) {
					int rowCount=0, columnCount=0;
					for(int k=0; k<max/2; k++) {
						if(arr[i][j+k] == arr[i][j+max-k-1]) rowCount++;
						if(arr[j+k][i] == arr[j+max-k-1][i]) columnCount++;
					}
					if(rowCount==max/2) return max;
					if(columnCount==max/2) return max;
				}
			}
		}
		return 0;
	}
}
