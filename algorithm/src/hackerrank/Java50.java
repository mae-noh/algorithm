package hackerrank;
import java.io.*;
import java.util.*;

public class Java50 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner scanner = new Scanner(System.in);
    	
    	int n = scanner.nextInt();
    	int m = scanner.nextInt();
    	
    	BitSet[] bit = new BitSet[2];
    	bit[0] = new BitSet(n);
    	bit[1] = new BitSet(n);
    	
    	for(int i=0; i<m; i++) {
    		String s = scanner.next();
    		
    		int n1 = scanner.nextInt();
    		int n2 = scanner.nextInt();
        	
    		if(s.equals("AND")) {
    			bit[n1-1].and(bit[n2-1]);
    		}
    		if(s.equals("SET")) {
    			bit[n1].set(n2);
    		}
    		if(s.equals("FLIP")) {
    			bit[n1].flip(n2);
    		}
    		if(s.equals("OR")) {
    			bit[n1-1].or(bit[n2-1]);
    		}
    		if(s.equals("XOR")) {
    			bit[n1-1].xor(bit[n2-1]);
    		}
    		System.out.println(bit[0].cardinality() + " " + bit[1].cardinality());
    	}
    	
    	
    }
}