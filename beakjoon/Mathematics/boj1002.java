package beakjoon.Mathematics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj1002 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.valueOf(br.readLine());
		for(int i=0; i<T; i++) {
			int result=0;
			String[] nums = br.readLine().split(" ");
			int x1 = Integer.valueOf(nums[0]);
			int y1 = Integer.valueOf(nums[1]);
			int r1 = Integer.valueOf(nums[2]);
			int x2 = Integer.valueOf(nums[3]);
			int y2 = Integer.valueOf(nums[4]);
			int r2 = Integer.valueOf(nums[5]);
			
			double r = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
			double sub = r1<r2 ? r2-r1 : r1-r2;
			
			if(r1==r2 && r==0) result=-1;
			else if(sub > r || r1+r2 < r) result=0;
			else if(r1+r2 == r || sub == r) result = 1;
			else if(r1+r2 > r) result = 2;
			
			bw.write(result + "\n");
		}
		bw.close();
		br.close();
	}	
	
}
