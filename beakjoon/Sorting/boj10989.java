package beakjoon.Sorting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj10989 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.valueOf(br.readLine());
		int[] arr = new int[N];
		int[] sortArr = new int[N];
		int[] count = new int[10001];
		for(int i=0; i<N; i++) {
			arr[i] = Integer.valueOf(br.readLine());
			count[arr[i]]++;
		}
		for(int i=1; i<count.length; i++) {
			count[i] += count[i-1];
		}
		for(int i=N-1; i>=0; i--) {
			System.out.println("i" + i);
			sortArr[--(count[arr[i]])] = arr[i];
		}
		for(int i=0; i<N; i++) {
			bw.write(sortArr[i] + "\n");
		}
		bw.close();
		br.close();
	}
	
}
