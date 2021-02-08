package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj1929 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		int M = Integer.valueOf(s[0]);
		int N = Integer.valueOf(s[1]);
		for(int i=M; i<=N; i++) {
			if(isPrime(i)) bw.write(i + "\n");
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
