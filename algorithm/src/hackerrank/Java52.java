package hackerrank;
import java.io.*;
import java.util.*;

public class Java52 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner scanner = new Scanner(System.in);
    	
    	try {
    		int x = scanner.nextInt();
    		int y = scanner.nextInt();
    		System.out.println(x/y);
    	}
    	catch(ArithmeticException e) {
    		System.out.println(e.getClass().getName() + ": / by zero");
    	}
    	catch(Exception e) {
    		System.out.println(e.getClass().getName());
    	}
    	
    	
    }
}