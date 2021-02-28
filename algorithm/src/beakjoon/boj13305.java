package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class boj13305 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.valueOf(br.readLine());
		List<Integer> len = new ArrayList<>(N-1);
		List<Integer> price = new ArrayList<>(N);
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N-1; i++) {
			len.add(i,Integer.valueOf(st.nextToken()));
		}
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			price.add(i,Integer.valueOf(st.nextToken()));
		}
		long sum=0;
		int i=0;
		for(i=0; i<N-1; i++) {
			int idx = i;
			long sumOfLen=len.get(i);
			for(int j=i+1; j<N-1; j++) {
				if(price.get(i) < price.get(j)) {
					sumOfLen += len.get(j);
					idx = j;
				}
			}
			sum += price.get(i)*sumOfLen;
			i = idx;	
		}
		System.out.println(sum);
	}
}
