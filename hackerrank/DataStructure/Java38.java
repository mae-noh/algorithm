package hackerrank.DataStructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Java38 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
			
		int n = scanner.nextInt();
		List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>(n);
	
		for(int i=0; i<=n; i++) {
			list.add(new ArrayList<Integer>());
		}
		
		for(int i=0; i<n; i++) {
			int l = scanner.nextInt();
			for (int j = 0; j < l; j++) {
				list.get(i).add(scanner.nextInt());
			}
		}
						
		n = scanner.nextInt();
		
		for(int i=0; i<n; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			
			try {
				System.out.println(list.get(x-1).get(y-1));
			}
			catch(IndexOutOfBoundsException e){
				System.out.println("Error!");
			}
			
		}
		
	}
	
}
