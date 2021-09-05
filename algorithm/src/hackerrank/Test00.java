package hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result1 {

    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void fizzBuzz(int n) {
    	// Write your code here
    	for(int i=1; i<=n; i++) {
    		StringBuffer sb = new StringBuffer();
    		if(i%3 == 0) sb.append("Fizz");
    		if(i%5 == 0) sb.append("Buzz");
    		if(i%3 != 0 && i%5 != 0)  sb.append(i +"");
    		System.out.println(sb);
    	}
    	
    }

}

public class Test00 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result1.fizzBuzz(n);

        bufferedReader.close();
    }
}
