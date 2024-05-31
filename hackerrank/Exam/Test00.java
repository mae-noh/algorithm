package hackerrank.Exam;
import java.io.*;

import static java.util.stream.Collectors.joining;


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
