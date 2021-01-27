package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj11720 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int N=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());
		int sum=0;
		String s = br.readLine();
		for(int i=0; i<N; i++) {
			sum+=Integer.parseInt(s.substring(i, i+1));
		}
		bw.write(sum+"");
		bw.flush();
		bw.close();
	}
	
}
