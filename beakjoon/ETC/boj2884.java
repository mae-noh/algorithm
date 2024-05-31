package beakjoon.ETC;

import java.util.Scanner;

public class boj2884 {

	public static void main(String[] args) {
		
		int H,M=0;
		
		Scanner scanner = new Scanner(System.in);
		
		H = scanner.nextInt();
		M = scanner.nextInt();
		
		if(45-M>0) {
			if(H==0) {
				H = 24;
			}
			H-=1;
			M+=60;
			M-=45;
		}else {
			M-=45;
		}
		
		System.out.println(H+" "+M);
		
	}
	
}
