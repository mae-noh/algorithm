package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class boj10952 {

	public static void main(String[] args) throws NumberFormatException, IOException{
		
		int A,B=0;
		String s="";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while((s = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(s);
			
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			
			bw.write(A+B+"\n");
		}
		bw.flush();
		bw.close();
		
	}
	
}
