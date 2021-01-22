package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class boj15596 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int n=0;
		int[] a;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		n = Integer.parseInt(br.readLine());
		a = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		bw.write(sum(a)+"");
		bw.flush();
		bw.close();
	}
	
	static long sum(int[] a) {
		long total=0;
		
		for(int i=0; i<a.length; i++) {
			total+=a[i];
		}
		
		return total;
	}
}
