package swea.List;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Q1229 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int testCase=1; testCase<=10; testCase++) {
			br.readLine();
			StringTokenizer st = new StringTokenizer(br.readLine());
			List<Integer> arr = new ArrayList<>();
			while(st.hasMoreTokens()) {
				arr.add(Integer.parseInt(st.nextToken()));
			}
			br.readLine();
			st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				String inst = st.nextToken();
				System.out.println(inst);
				if(inst.equals("I")) {
					int idx = Integer.parseInt(st.nextToken());
					int num = Integer.parseInt(st.nextToken());
					System.out.println("*" + idx + " " + num);
					for(int i=0; i<num; i++) {
						arr.add(idx++, Integer.parseInt(st.nextToken()));
					}
				}
				if(inst.equals("D")) {
					int idx = Integer.parseInt(st.nextToken());
					int num = Integer.parseInt(st.nextToken());
					for(int i=0; i<num; i++) {
						arr.remove(idx);
					}
				}
			}
			bw.write("#"+testCase+" ");
			for(int i=0; i<10; i++) {
				bw.write(arr.get(i)+" ");
			}
			bw.newLine();
		}
		bw.close();
	}
}
