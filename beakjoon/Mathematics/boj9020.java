package beakjoon.Mathematics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj9020 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.valueOf(br.readLine());
		for(int i=0; i<T; i++) {
			int n = Integer.valueOf(br.readLine());
			int mid = n/2;
			for(int j=mid; j>=2; j--) {
				int num = n-j;
				if(isPrime(j) && isPrime(num)) {
					bw.write(j + " " + num + "\n");
					break;
				}
			}
		}
		bw.close();
		br.close();
	}
	public static boolean isPrime(int n) {
		if(n==1) return false;
		for(int i=2; i*i<=n; i++) {
			if(n%i==0) return false;
		}
		return true;
	}
}
