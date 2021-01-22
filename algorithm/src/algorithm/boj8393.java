package algorithm;

import java.util.Scanner;

public class boj8393 {

	public static void main(String[] args) {
	
		int n,sum=0;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		for(int i=1; i<=n; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
	
}
