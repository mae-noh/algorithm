package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class babygin {
	public static void main(String[] args) throws IOException {
		int[] arr = new int[10];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i=0; i<10; i++) {
			arr[i] = i;	
		}
		Arrays.toString(arr);
	}
}
