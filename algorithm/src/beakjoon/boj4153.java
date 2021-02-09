package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class boj4153 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] points = new int[3];
		while(true) {
			String[] s = br.readLine().split(" ");
			String result = "wrong";
			points[0] = Integer.valueOf(s[0]);
			points[1] = Integer.valueOf(s[1]);
			points[2] = Integer.valueOf(s[2]);
			if(points[0]+points[1]+points[2] == 0) break;
			Arrays.sort(points);
			if(points[0]*points[0] + points[1]*points[1] == points[2]*points[2]) result = "right";
			bw.write(result+"\n");
		}
		bw.close();
		br.close();
	}
	
}
