package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj2798 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		int N = Integer.valueOf(s[0]);
		int M = Integer.valueOf(s[1]);
		int[] arr = new int[N];
		s = br.readLine().split(" ");
		for(int i=0; i<N; i++) {
			arr[i] = Integer.valueOf(s[i]);
		}
		int max = 0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				for(int k=0; k<N; k++) {
					if(i == j || j == k || k == i) continue;
					if(arr[i] + arr[j] + arr[k] <= M && arr[i] + arr[j] + arr[k] > max) max = arr[i] + arr[j] + arr[k];
				}
			}
		}
		bw.write(max+"");
		bw.close();
	}
}
