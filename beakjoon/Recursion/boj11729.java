package beakjoon.Recursion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj11729 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.valueOf(br.readLine());
		bw.write((int)Math.pow(2,N)-1+"\n");
		hanoi('1','2','3',N,bw);
		bw.close();
		br.close();
	}
	
	private static void hanoi(char from, char mid, char to, int n, BufferedWriter bw) throws IOException {
		if(n==1) {
			bw.write(from + " " + to + "\n");
			return;
		}
		hanoi(from, to, mid, n-1, bw);
		bw.write(from + " " + to + "\n");
		hanoi(mid, from, to, n-1, bw);
	}
	
}
