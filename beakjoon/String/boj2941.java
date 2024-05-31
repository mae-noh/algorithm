package beakjoon.String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj2941 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String text = br.readLine();
		int cnt=0;
		for(int i=0; i<text.length(); i++) {
			char ch = text.charAt(i);
			if(ch == 'd') {
				if(i+2 < text.length() && text.charAt(i+1) == 'z' && text.charAt(i+2) == '=') {
					i+=2;
				}
				if(i+1 < text.length() && text.charAt(i+1) == '-') {
					i++;
				}
				cnt++;
				continue;
			}
			if(ch=='c' || ch =='s' || ch=='z') {
				if(i+1 < text.length() && (text.charAt(i+1) =='-' || text.charAt(i+1) =='=')) {
					i++;
				}
				cnt++;
				continue;
			}
			if(ch=='l' || ch=='n') {
				if(i+1 < text.length() && text.charAt(i+1) == 'j') {
					i++;
				}
				cnt++;
				continue;
			}
			cnt++;
		}
		bw.write(cnt+"");
		bw.flush();
		bw.close();
		br.close();
		
	}

}
