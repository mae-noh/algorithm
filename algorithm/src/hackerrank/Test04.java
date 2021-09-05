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



class Result04 {

    /*
     * Complete the 'fountainActivation' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY locations as parameter.
     */

    public static int fountainActivation(List<Integer> locations) {
    // Write your code here
    	int n = locations.size();
    	int[] dp = new int[n];
    	for (int i = 0; i < n; i++)
        {
            int l = Math.max(i - locations.get(i), 0);
            int r = Math.min(i + locations.get(i) + 1, n);
            dp[l] = Math.max(dp[l], r);
        }
    	
    	int cur = dp[0];
    	int nextMax = cur;
    	int count = 1;
    	
    	for(int i = 0; i < n; i++) {
    		nextMax = Math.max(nextMax, dp[i]);
    		if(cur == i) {
    			count++;
    			cur = nextMax;
    		}			
    	}
    	
    	return count;
    }

}

public class Test04 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int locationsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> locations = IntStream.range(0, locationsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result04.fountainActivation(locations);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
