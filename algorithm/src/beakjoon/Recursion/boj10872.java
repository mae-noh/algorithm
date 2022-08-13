package beakjoon.Recursion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj10872 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.valueOf(br.readLine());
		bw.write(fac(N)+"");
		bw.close();
		br.close();
	}

	private static int fac(int n) {
		int result=1;
		for(int i=n; i>1; i--) {
			result*=i;
		}
		return result;
	}
	
}
