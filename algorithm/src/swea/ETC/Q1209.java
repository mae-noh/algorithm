package swea.ETC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1209 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = new int[100][100];
		StringTokenizer st;
		for(int test_case=1; test_case<=10; test_case++) {
			int N = Integer.parseInt(br.readLine());
			for(int i=0; i<100; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0; j<100; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			int sumOfCrossRight=0, sumOfCrossLeft=0, max=0;
			for(int i=0; i<100; i++) {
				int sumOfCol=0, sumOfRow=0;
				for(int j=0; j<100; j++) {
					sumOfCol += arr[j][i];
					sumOfRow += arr[i][j];
					if(i==j) sumOfCrossRight += arr[i][j];
					if(i+j==99) sumOfCrossLeft += arr[i][j];
				}
				max = Math.max(max, Math.max(Math.max(sumOfCol, sumOfRow), Math.max(sumOfCrossRight, sumOfCrossLeft)));
			}
			System.out.println("#"+N+" "+max);
		}
	}
}