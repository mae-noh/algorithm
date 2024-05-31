package swea.List;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Q1230 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		for(int testCase=1; testCase<=10; testCase++) {
			List<Integer> list = new LinkedList<>();
			br.readLine();
			st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				list.add(Integer.parseInt(st.nextToken()));
			}
			br.readLine();
			st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				String token = st.nextToken();
				if(token.equals("I")) {
					int idx = Integer.parseInt(st.nextToken());
					int num = Integer.parseInt(st.nextToken());
					while(num>0) {
						list.add(idx++, Integer.parseInt(st.nextToken()));
						num--;
					}					
				}else if(token.equals("D")) {
					int idx = Integer.parseInt(st.nextToken());
					int num = Integer.parseInt(st.nextToken());
					while(num>0) {
						list.remove(idx);
						num--;
					}
				}else if(token.equals("A")) {
					int num = Integer.parseInt(st.nextToken());
					while(num>0) {
						list.add(Integer.parseInt(st.nextToken()));
						num--;
					}
				}
			}
			bw.write("#"+testCase+" ");
			for(int i=0; i<10; i++) {
				bw.write(list.get(i) + " ");
			}
			bw.newLine();
		}
		bw.close();
	}
}
