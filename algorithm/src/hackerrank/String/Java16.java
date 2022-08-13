package hackerrank.String;

import java.util.Scanner;

public class Java16 {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        int max = s.length()-k+1;
        
        smallest = s.substring(0,k);
        largest = s.substring(0,k);
        
        for(int i=1; i<max; i++) {
        	String st = s.substring(i, i+k);
        	if(smallest.compareTo(st) > 0) smallest = st;
        	if(largest.compareTo(st) < 0) largest = st;
        }        
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}