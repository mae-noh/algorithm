package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj3009 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] countX = new int[1000+1];
		int[] countY = new int[1000+1];
		int xi = 0;
		int yi = 0;
		for(int i=0; i<3; i++) {
			String[] points = br.readLine().split(" ");
			int x = Integer.valueOf(points[0]);
			int y = Integer.valueOf(points[1]);
			countX[x]++;
			countY[y]++;
		}
		for(int i=0; i<=1000; i++) {
			if(countX[i]==1) {
				xi=i;
				break;
			}
		}
		for(int i=0; i<=1000; i++) {
			if(countY[i]==1) {
				yi=i;
				break;
			}
		}		
		bw.write(xi + " " + yi);
		bw.close();
		br.close();
	}
	
}
