package beakjoon.Mathematics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj2839 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.valueOf(br.readLine());
		bw.write(result(N)+"");
		bw.close();
	}

	private static int result(int N) {
		int i=0,j=0;
		for(i=N/5; i>=0; i--) {
			for(j=0; j<=N/3; j++) {
				System.out.println("i" + i + " j" + j);
				if(5*i + 3*j == N) return i+j;
			}
		}
		return -1;
	}
	
}
