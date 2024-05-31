package beakjoon.ETC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	   public static void main(String[] args) throws NumberFormatException, IOException{
		  
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int T = Integer.parseInt(br.readLine());
			StringTokenizer st = null;
			for(int i=0; i<T; i++){
				st = new StringTokenizer(br.readLine());
				long N = Long.parseLong(st.nextToken());
				long M = Long.parseLong(st.nextToken());
				System.out.println(countCoupon(N, M));
			}
		}
		private static long countCoupon(long N, long M) {
			if(N<5) return 0;
			
			long cnt=0, min=N/5;
			for(int i=5; i<12; i++){
				long season = N/i;
				long normal = M/(12-i);
				if(normal == 0) continue;
				if(season <= normal) cnt = season;
				if(season > normal) cnt = normal;
				min = cnt > min ? cnt : min;
				min = min > (N+M)/12 ? (N+M)/12 : min;
			}			
			return min;
		}
		
//		private static long countCoupon(long N, long M) {
//			return Math.min(N/5, (N+M)/12);
//		}
}

