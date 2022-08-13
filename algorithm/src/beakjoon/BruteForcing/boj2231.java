package beakjoon.BruteForcing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj2231 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String N = br.readLine();
		int len = N.length();
		int numN = Integer.valueOf(N);
		String[] arr = new String[numN+1];
		int result = 0, i=0, j=0, tmp=0;
		for(i = numN < 9 ? 1 : numN-len*9; i<numN; i++) {
			arr[i] = i + "";
			j=arr[i].length()-1;
			tmp=i;
			while(j>=0) {
				tmp += arr[i].charAt(j) - '0';
				j--;
			}
			if(tmp == numN) {
				result = i;
				break;
			}
		}
		bw.write(result+"");
		bw.close();
		br.close();
	}
}
