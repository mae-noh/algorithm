package beakjoon;

import java.util.Scanner;

public class boj2588 {

	public static void main(String[] args) {
		
		int A,B,C = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		A = scanner.nextInt();
		B = scanner.nextInt();
		C = B;
		
		System.out.println(A*(B%10));
		B/=10;
		System.out.println(A*(B%10));
		B/=10;
		System.out.println(A*(B%10));
		B/=10;
		System.out.println(A*C);
		
	}
	
}
