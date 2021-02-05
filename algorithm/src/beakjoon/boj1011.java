package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class boj1011 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.valueOf(br.readLine());
		for(int i=0; i<T; i++) {
			String[] s = br.readLine().split(" ");
			BigInteger end = new BigInteger(s[1]);
			BigInteger start = new BigInteger(s[0]);		
			BigInteger d = end.subtract(start);
			bw.write(d.compareTo(BigInteger.ONE) == 1 ? count(end.subtract(start.add(BigInteger.TWO)))+"\n" : 1+"\n");
		}
		bw.close();
		br.close();
	}

	private static int count(BigInteger d) {
		int result=0;
		int start=0, end=2;
		int k=0;
		while(d.compareTo(BigInteger.ZERO) == 1) {
			for(k=end; k>=start; k--) {
				BigInteger sum = new BigInteger(k+"").multiply(new BigInteger(k+1+""));
				sum = (sum.divide(BigInteger.TWO)).subtract(BigInteger.ONE);
				if(d.compareTo(sum) == 0 || d.compareTo(sum) == 1) {
					start = k-1;
					end = k+1;
					d=d.subtract(new BigInteger(k+""));
					result++;
					break;
				}
			}
		}
		return result+2;
	}
	
}
