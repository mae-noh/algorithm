package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj2577 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int A=0,B=0,C=0,result=0;
		int[] count = new int[10];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		A = Integer.parseInt(br.readLine());
		B = Integer.parseInt(br.readLine());
		C = Integer.parseInt(br.readLine());
		
		result = A*B*C;
		
		while(result>0) {
			count[result % 10]++;
			result/=10;
		}
		
		for(int i=0; i<10; i++) {
			bw.write(count[i] + "\n");
		}
		bw.flush();
		bw.close();
	}
	
}
