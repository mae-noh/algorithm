package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class boj1157 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		int N = 'Z';
		int count[] = new int[N+1];
		for(int i=0; i<s.length(); i++) {
			int idx = s.charAt(i);
			if(idx >= 'a') {
				idx -= 'a'-'A';
			}
			count[idx]++;
		}
		int max=0, prevMax=0, maxIdx=0;
		for(int i='A'; i<='Z'; i++) {
			if(max == count[i]) {
				prevMax = count[i];
			}
			if(max < count[i]) {
				max = count[i];
				maxIdx = i;
			}
		}
		if(max == prevMax) {
			bw.write("?");
		}else {
			bw.write((char)(maxIdx)+"");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
