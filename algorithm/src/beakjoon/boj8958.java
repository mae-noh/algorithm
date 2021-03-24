package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class boj8958 {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		int T=0;
		String s="";

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			s = br.readLine();
			bw.write(calScore(s)+"\n");
		}
		bw.flush();
		bw.close();
	}
	
	static int calScore(String s) {
		int total=0, score=0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == 'O') {
				score++;
				total+=score;
			}
			if(s.charAt(i) == 'X') {
				score=0;
			}
		}
		return total;
	}
	
}
