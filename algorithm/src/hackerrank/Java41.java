package hackerrank;
import java.io.*;
import java.util.*;

public class Java41 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	int n = scanner.nextInt();
    	List<Integer> list = new ArrayList<>(n);
    	
    	for(int i=0; i<n; i++) {
    		list.add(scanner.nextInt());
    	}
    	
    	n = scanner.nextInt();
    	for(int i=0; i<n; i++) {
    		scanner.nextLine();
    		String s = scanner.nextLine();
    		
    		System.out.println(i + " " + s);
    		
    		if(s.equals("Insert")) {
    			int index = scanner.nextInt();
    			int num = scanner.nextInt();
    			list.add(index, num);
    		}
    		if(s.equals("Delete")) {
    			int index = scanner.nextInt();
    			list.remove(index);
    		}
    	}
    	
    	System.out.println(list.toString().replaceAll("[^0-9 ]", ""));
    }
}