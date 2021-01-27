package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj3052 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int[] numCnt = new int[42];
		int cnt=0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		for(int i=0; i<10; i++) {
			numCnt[Integer.parseInt(br.readLine())%42]++;
		}
		
		for(int i=0; i<42; i++) {
			if(numCnt[i]>0) cnt++;
		}
		
		bw.write(cnt+"");
		bw.flush();
		bw.close();
		
	}
	
}
