package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj11653 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.valueOf(br.readLine());
		StringBuffer s = new StringBuffer("");
		for(int i=2; i<=Math.sqrt(N); i++) {
			if(N%i!=0) continue;
			s.append(i).append("\n");
			N/=i--;
		}
		if(N!=1) s.append(N);
		bw.write(s+"");
		bw.close();
	}
	
}
