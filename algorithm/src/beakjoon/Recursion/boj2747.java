package beakjoon.Recursion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj2747 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.valueOf(br.readLine());
		bw.write(fibo_recursive(n)+"\n");
		bw.write(fibo(n)+"");
		bw.close();
	}

	private static int fibo_recursive(int n) {
		if(n<=1) return n;
		return fibo_recursive(n-1) + fibo_recursive(n-2);
	}
	
	private static int fibo(int n) {
		int[] arr = new int[n+1];
		arr[0] = 0;
		arr[1] = 1;
		for(int i=2; i<=n; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		return arr[n];
	}
}
