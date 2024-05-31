package beakjoon.String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj2908 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String text = br.readLine();
		String[] num = text.split(" ");
		
		int A = reverse(num[0]);
		int B = reverse(num[1]);
		
		int result = A > B ? A : B;
		bw.write(result + "");
		
		bw.flush();
		bw.close();
		br.close();
//		for(int i=2; i>=0; i--) {
//			if(num[0].charAt(i) == num[1].charAt(i)) {
//				bw.write(num[0].charAt(i)+"");
//				continue;
//			}
//			if(num[0].charAt(i) > num[1].charAt(i)) {
//				while(i>=0) {
//					bw.write(num[0].charAt(i)+"");
//					i--;
//				}
//				break;
//			}
//			if(num[0].charAt(i) < num[1].charAt(i)) {
//				while(i>=0) {
//					bw.write(num[1].charAt(i)+"");
//					i--;
//				}
//				break;
//			}
//		}
	}

	private static int reverse(String num) {
		String result = "";
		for(int i=2; i>=0; i--) {
			result += num.charAt(i);
		}
		return Integer.parseInt(result);
	}
	
}
