package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class boj7569 {

	public static int[][][] tomatoField;
	public static int N,M,H;
	public static int[] dx = {1,0,-1,0,0,0};
	public static int[] dy = {0,1,0,-1,0,0};
	public static int[] dz = {0,0,0,0,-1,1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer s = new StringTokenizer(br.readLine());
		N = Integer.valueOf(s.nextToken());
		M = Integer.valueOf(s.nextToken());
		H = Integer.valueOf(s.nextToken());
		for(int i=0; i<N; i++) {
			s = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++) {
				for(int k=0; k<H; k++) {
					tomatoField[i][j][k] = Integer.valueOf(s.nextToken());
				}
			}
		}
	}
	
}
