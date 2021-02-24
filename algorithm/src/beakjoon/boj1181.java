package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class boj1181 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		int N = Integer.parseInt(br.readLine());
		String[] arr = new String[N];
		for(int i=0; i<N; i++) {
			arr[i] = br.readLine();
		}
		Arrays.sort(arr,(a, b)->{
			if(a.length() == b.length()) {
				return a.compareTo(b);
			}else {
				return a.length()-b.length();
			}
		});
		Set<String> set = new LinkedHashSet<>();
		for(String s : arr) {
			set.add(s);
		}
		for(String s : set) {
			bw.write(s + "\n");
		}
		bw.close();
		br.close();
	}
	
}
