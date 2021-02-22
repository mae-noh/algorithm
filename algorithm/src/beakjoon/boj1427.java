package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class boj1427 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		LinkedList<Integer> list = new LinkedList<>();
		for(int i=0; i<s.length(); i++) {
			list.add(Integer.valueOf(s.charAt(i)-'0'));
		}
		list.sort(Collections.reverseOrder());
		for(int i : list) {
			bw.write(i + "");
		}
		bw.close();
		br.close();
	}
	
}
