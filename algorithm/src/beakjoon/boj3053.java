package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj3053 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double R = Double.valueOf(br.readLine());
		double uCircle = Math.PI*R*R;
		double tCircle = 2*R*R;
		System.out.printf("%6f\n%6f", uCircle,tCircle);
	}

}
