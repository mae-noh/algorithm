package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class boj10871 {

	public static void main(String[] args) throws IOException {
		
		int N,X,num=0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		N=Integer.parseInt(st.nextToken());
		X=Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) {
			num = Integer.parseInt(st.nextToken());
			if(num < X) {
				bw.write(num + " ");
			}
		}
		bw.flush();
		bw.close();
	}
	
}
