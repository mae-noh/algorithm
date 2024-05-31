package beakjoon.BruteForcing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj7568 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.valueOf(br.readLine());
		int[] arr = new int[N*3+1];
		for(int i=0; i<N*3; i+=3) {
			String[] s = br.readLine().split(" ");
			arr[i] = Integer.valueOf(s[0]);
			arr[i+1] = Integer.valueOf(s[1]);
			System.out.println(arr[i] + " " + arr[i+1]);		
		}
		for(int i=0; i<N*3; i+=3) {
			for(int j=0; j<N*3+1; j+=3) {
				if(i==j) continue;
				if(arr[i] < arr[j] && arr[i+1] < arr[j+1]) arr[i+2]++;
			}
		}
		for(int i=2; i<N*3; i+=3) {
			bw.write(arr[i]+1 + " ");
		}
		bw.close();
		br.close();
	}
}
