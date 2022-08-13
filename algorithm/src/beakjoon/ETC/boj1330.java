package beakjoon.ETC;

import java.util.Scanner;

public class boj1330 {

	public static void main(String[] args) {
		
		int A,B = 0;
		Scanner scanner = new Scanner(System.in);
		
		A = scanner.nextInt();
		B = scanner.nextInt();
		
		if(A > B) {
			System.out.println(">");
		}
		if(A < B) {
			System.out.println("<");
		}
		if(A == B) {
			System.out.println("==");
		}
	}
	
}
