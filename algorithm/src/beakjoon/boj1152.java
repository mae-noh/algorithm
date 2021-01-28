package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj1152 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine().strip();
		if(s.length() == 0) {
			bw.write("0");
		}else {
			String[] words = s.split(" ");
			bw.write(words.length+"");
		}
		bw.flush();
		bw.close();
	}
	
}
