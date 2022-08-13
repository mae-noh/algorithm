package beakjoon.Mathematics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class boj4948 {

	// true : 소수, false : 소수 아님
	static boolean[] checked = new boolean[246913];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
			int n = Integer.valueOf(br.readLine());
			if(n == 0) break;
			int cnt=0;
			for(int i=n+1; i<=2*n; i++) {
				if(isPrime(i)) cnt++;
			}
			bw.write(cnt+"\n");
		}
		bw.close();
		br.close();
	}
	
	public static boolean isPrime(int n) {
		if(n==1) return false;
		if(checked[n]) return true;
		for(int i=2; i*i<=n; i++) {
			if(n%i==0) return false;
		}
		for(int i=n; i<2*n; i+=n) {
			checked[i] = true;
		}
		return true;
	}
	
}
