package beakjoon.ETC;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class boj1546 {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		int N=0, max=0, sum=0, num=0;
		double avg=0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());

		for(int i=0; i<N; i++) {
			num = Integer.parseInt(st.nextToken());
			if(max<num) {
				max = num;
			}
			sum+=num;
		}
		avg = sum/(double)N;
		avg = avg/max*100.0;
		
		bw.write(avg+"");
		bw.flush();
		bw.close();
	}
	
}
