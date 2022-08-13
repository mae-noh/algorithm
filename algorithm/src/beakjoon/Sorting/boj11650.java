package beakjoon.Sorting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class boj11650 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));		
		int N = Integer.parseInt(br.readLine());
		List<LinkedList<Integer>> arr = new ArrayList<>(200001);
		for(int i=0; i<200001; i++) {
			arr.add(i, null);
		}
		for(int i=0; i<N; i++) {
			String[] s = br.readLine().split(" ");
			int a = Integer.valueOf(s[0])+100000;
			int b = Integer.valueOf(s[1])+100000;
			if(arr.get(a) == null) {
				LinkedList<Integer> list = new LinkedList<>();
				list.add(b);
				arr.set(a, list);
			}else {
				arr.get(a).add(b);
			}			
		}
		int cnt=0;
		for(int i=1; i<200001; i++) {
			if(arr.get(i) == null) continue;
			if(cnt == N) break;
			cnt++;
			arr.get(i).sort(Comparator.naturalOrder());
			for(int list : arr.get(i)) {
				int t = list-100000;
				bw.write(i-100000 + " " + t + "\n");
			}
		}
		bw.close();
		br.close();
	}
	
}
