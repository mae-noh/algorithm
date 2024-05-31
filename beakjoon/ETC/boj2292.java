package beakjoon.ETC;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj2292 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.valueOf(br.readLine());
		bw.write(sumOfRoom(N) + "");
		bw.flush();
		bw.close();
		br.close();
	}

	private static int sumOfRoom(int N) {
		int sum=0;
		int i=0;
		while(1+6*sum < N) {
			sum+=++i;
		}
		return i+1;
	}
	
}
