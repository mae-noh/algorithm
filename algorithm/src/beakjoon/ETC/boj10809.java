package beakjoon.ETC;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj10809 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = 26;
		int alphabet[] = new int[N+1];
		for(int i=0; i<N; i++) {
			alphabet[i]=-1;
		}
		String s = br.readLine();
		for(int i=0; i<s.length(); i++) {
			int index = (int)s.charAt(i)-'a';
			if(alphabet[index] != -1) continue;
			alphabet[index]=i;
		}
		for(int i=0; i<N; i++) {
			bw.write(alphabet[i] + " ");
		}
		bw.flush();
		bw.close();
	}
	
}
