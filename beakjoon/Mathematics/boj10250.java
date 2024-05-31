package beakjoon.Mathematics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj10250 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String[] s = br.readLine().split(" ");
			int H = Integer.valueOf(s[0]);
			int W = Integer.valueOf(s[1]);
			int N = Integer.valueOf(s[2]);
			
			int floor = N%H;
			int number = (int)Math.ceil(N/(double)H);
			
			bw.write(floor == 0 ? "" + H : "" + floor);
			bw.write(number < 10 ? "0" + number : "" +number);
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}
	
}
