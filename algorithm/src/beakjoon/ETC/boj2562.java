package beakjoon.ETC;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj2562 {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		int max=0, index=0, tmp=0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=1; i<=9; i++) {
			tmp = Integer.parseInt(br.readLine());
			if(max < tmp) {
				max = tmp;
				index = i;
			}
		}
		bw.write(max+"\n"+index);
		bw.flush();
		bw.close();
		
	}
	
}
