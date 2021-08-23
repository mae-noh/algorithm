package hackerrank;

import java.util.Scanner;

public class java09 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String str;
		int i=0;
		while(scanner.hasNext()) {
			str = scanner.nextLine();
			System.out.println(++i + " " + str);
		}
		
	}
	
}
