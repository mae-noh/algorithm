package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj1316 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		int cnt=0;
		for(int i=0; i<T; i++) {
			String text = br.readLine();
			cnt+=checkGroupWord(text);
		}
		
		bw.write(cnt+"");
		bw.flush();
		bw.close();
		br.close();
	}

	private static int checkGroupWord(String text) {
		for(int i=0; i<text.length(); i++) {
			char ch = text.charAt(i);
			if(text.indexOf(ch) == text.lastIndexOf(ch)) continue;
			for(int j=text.indexOf(ch); j<text.lastIndexOf(ch); j++) {
				if(ch != text.charAt(j)) return 0;
			}
		}
		return 1;
	}
	
}
