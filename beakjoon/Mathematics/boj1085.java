package beakjoon.Mathematics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj1085 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] points = br.readLine().split(" ");
		int x = Integer.valueOf(points[0]);
		int y = Integer.valueOf(points[1]);
		int w = Integer.valueOf(points[2]);
		int h = Integer.valueOf(points[3]);
		int min = 1000;
		if(min > x-0) min = x-0;
		if(min > y-0) min = y-0;
		if(min > w-x) min = w-x;
		if(min > h-y) min = h-y;
		bw.write(min + "");
		bw.close();
		br.close();
	}

}
