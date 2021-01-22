package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj1065 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		int N=0, cnt=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=N; i++) {
			if(i<=99 || i>99 && checkNum(i)) {
				cnt++;
			}
		}
		bw.write(cnt+"\n");
		bw.flush();
		bw.close();
		
	}

	static boolean checkNum(int i) {

		int prev=10, num=0;
		while(i>0) {
			if(prev<10 && prev!=num-i%10) {
				return false;
			}
			num = i%10;
			i/=10;
			if(prev==10) {
				prev = num - i%10;
			}
		}
		return true;
	}

}
