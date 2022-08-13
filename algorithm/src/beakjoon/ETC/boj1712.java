package beakjoon.ETC;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj1712 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] num = br.readLine().split(" ");
		
		int A = Integer.parseInt(num[0]);
		int B = Integer.parseInt(num[1]);
		int C = Integer.parseInt(num[2]);
		
		int N = C-B>0 ? A/(C-B) : -2;
		bw.write(N+1 + "");
		bw.flush();
		bw.close();
		br.close();
	}
	
}
