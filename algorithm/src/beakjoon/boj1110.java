package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj1110 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int N,cnt=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());
		int tmp = N;
		while(true) {
			int num = N%10*10 + (N/10 + N%10)%10;
			cnt++;
			if(num == tmp) break;
			N = num;
		}
		
		bw.write(cnt+"");
		bw.flush();
		bw.close();
	}
	
}
