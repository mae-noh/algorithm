package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj1193 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int X = Integer.valueOf(br.readLine());
		int cnt=0;
		for(int i=2; i<=10000001; i++) {
				for(int j=i; j>0; j--) {
					int d = i-j;
					if(d==0) continue;
					cnt++;
					if(cnt == X) {
						if(i%2==0) {
							bw.write(j+"/"+d);
						}else {
							bw.write(d+"/"+j);
						}
						bw.flush();
						bw.close();
						return;
					}
				}
		}
	}
	
}
