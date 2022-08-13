package beakjoon.Greedy;

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
		int min = 1000000001;
		for(int i=0; i<N-1; i++) {
			if(min > price.get(i)){
				min = price.get(i);
			}
			sum += (long)min*len.get(i);
		}
		
		System.out.println(sum);
	}
}
