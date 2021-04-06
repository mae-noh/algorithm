package swea;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q1228 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		for(int testCase=1; testCase<=10; testCase++) {
			br.readLine();
			st = new StringTokenizer(br.readLine());
			ArrayList<String> list = new ArrayList<>();
			while(st.hasMoreTokens()){
				list.add(st.nextToken());
			}
			br.readLine();
			String[] s = br.readLine().split("[.I]");
			for(int i=1; i<s.length; i++) {
				st = new StringTokenizer(s[i]);
				int idx = Integer.parseInt(st.nextToken());
				st.nextToken();
				while(st.hasMoreTokens()) {
					list.add(idx, st.nextToken());
					idx++;
				}				
			}			
			for(int i=0; i<10; i++) {
				bw.write("#" + testCase + " ");
				bw.write(list.get(i)+" ");
			}
			bw.newLine();
			bw.flush();
		}
		bw.close();
		br.close();
	}
}
