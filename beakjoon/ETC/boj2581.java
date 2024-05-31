package beakjoon.ETC;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj2581 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int M = Integer.valueOf(br.readLine());
		int N = Integer.valueOf(br.readLine());
		int sum = 0, min = 0;
		boolean[] numbers = new boolean[N+1];
		for(int i=M; i<=N; i++) {
			int j = 0;
			if(numbers[i]) continue;
			for(j=2; j<i; j++) {
				if(i%j != 0) continue;
				numbers[i] = true;
				break;
			}
			if(i == j) sum += i;
			if(i == j && min == 0) min = i;
		}
		bw.write(sum > 0 ? sum+"\n"+min : -1+"");
		bw.close();
		br.close();
	}
	
}
