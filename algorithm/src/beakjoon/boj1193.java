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
		
		int sum = 0;
		int groupN = 1;
		int lastnum = 0;
		while((lastnum = 1 + sum) < X) {
			sum += ++groupN;
		}
		int diff = lastnum - X;
		
		int denom=1, numer=1;
		if(groupN%2==0) {
			denom=1+diff;
			numer=groupN-diff;
		}else {
			denom=groupN-diff;
			numer=1+diff;
		}
		bw.write(numer+"/"+denom);
		bw.flush();
		bw.close();
		
//		int cnt=0;
//		for(int i=2; i<=10000001; i++) {
//				for(int j=i; j>0; j--) {
//					int d = i-j;
//					if(d==0) continue;
//					cnt++;
//					if(cnt == X) {
//						if(i%2==0) {
//							bw.write(j+"/"+d);
//						}else {
//							bw.write(d+"/"+j);
//						}
//						bw.flush();
//						bw.close();
//						return;
//					}
//				}
//		}
	}
	
}
