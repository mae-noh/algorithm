package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj1712 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] num = br.readLine().split(" ");
		
		int[] inum = strToInt(num);
		
		int N = inum[2]-inum[1]>0 ? inum[0]/(inum[2]-inum[1]) : -2;
		bw.write(N+1 + "");
		bw.flush();
		bw.close();
		br.close();
	}

	private static int[] strToInt(String[] num) {
		int[] inum = new int[num.length];
		for(int i=0; i<num.length; i++) {
			inum[i] = Integer.valueOf(num[i]);
		}
		return inum;
	}	
	
}
