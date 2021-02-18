package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj1436 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.valueOf(br.readLine());
		final int MAX = 3000000;
		int[] checkArr = new int[MAX];
		int cnt=0;
		String num = "";
		for(int i=666; i<MAX; i++) {
			num = String.valueOf(i);
			if(num.contains("666") == false) continue;
			else cnt++;
			if(cnt == N) {
				bw.write(i+"");
				break;
			}
		}
		bw.close();
		br.close();
	}
	
}
