package beakjoon.ETC;

import java.util.Scanner;

public class boj2739 {

	public static void main(String[] args) {
		int num=0;
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		for(int i=1; i<=9; i++) {
			System.out.println(num+" * "+i+" = "+num*i);
		}
	}
	
}
