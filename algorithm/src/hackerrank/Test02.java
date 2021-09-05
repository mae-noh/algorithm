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



class Result02 {

    /*
     * Complete the 'findRange' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts INTEGER num as parameter.
     */

    public static long findRange(int num) {
    // Write your code here
    	long max = num;
        long min = num;

        String s = String.valueOf(num);

        for(int i=0; i<10; i++) {
    		if(!s.contains("" + i)) continue;
    		for(int j=0; j<10; j++) {
    			if(s.charAt(0) == i+'0' && j == 0 || i == j) continue;
    			
    			String tmp = s.replace(i+"", j+"");
    			long n = Long.parseLong(tmp);
    			
    			max = max < n ? n : max;
    			min = min > n ? n : min;
    		}
    	}
		
    	return max - min;
    }

}

public class Test02 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(bufferedReader.readLine().trim());

        long result = Result02.findRange(num);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
