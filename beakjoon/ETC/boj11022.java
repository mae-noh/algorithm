package beakjoon.ETC;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class boj11022 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int A,B,N,result=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=N; i++) {
			st = new StringTokenizer(br.readLine());
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			result = A+B;
			bw.write("Case #"+ i +": " + A + " + " + B + " = " + result + "\n");
		}
		bw.flush();
		bw.close();
	}
	
}
