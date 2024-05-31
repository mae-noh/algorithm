package beakjoon.Mathematics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj2869 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] num = br.readLine().split(" ");
		
		double A = Double.valueOf(num[0]);
		double B = Double.valueOf(num[1]);
		double V = Double.valueOf(num[2]);
		
		double ans = (V-B)/(A-B);
		
		bw.write((int)Math.ceil(ans)+"");		
		bw.flush();
		bw.close();
		br.close();
	}
	
}
