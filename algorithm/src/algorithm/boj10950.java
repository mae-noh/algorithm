package algorithm;

import java.util.Scanner;

public class boj10950 {

	public static void main(String[] args) {
		
		int A,B,T=0;
		Scanner scanner = new Scanner(System.in);
		T=scanner.nextInt();
		
		for(int i=0; i<T; i++) {
			A=scanner.nextInt();
			B=scanner.nextInt();
			System.out.println(A+B);
		}
		
	}
	
}
