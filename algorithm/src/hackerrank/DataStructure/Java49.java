package hackerrank.DataStructure;

import java.util.*;

public class Java49 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Deque deque = new ArrayDeque<>();
		Set<Integer> set = new HashSet<>();
	
		int n = in.nextInt();
		int m = in.nextInt();

		int max = 0;
		for (int i = 0; i < n; i++) {
			int num = in.nextInt();
			deque.add(num);
			set.add(num);
			
			if(deque.size() == m) {
				max = max < set.size() ? set.size() : max;
				int e = (int) deque.poll();
				if(!deque.contains(e)) set.remove(e);
			}
		}
		
		System.out.println(max);
	}
}
