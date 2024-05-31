package hackerrank.String;
import java.io.*;
import java.util.*;

public class Java19 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        
        java.util.StringTokenizer st = new java.util.StringTokenizer(s,"[!,?._'@ ]");
        System.out.println(st.countTokens());
        
        while(st.hasMoreTokens()) {
        	System.out.println(st.nextToken());
        }
        
        scan.close();
    }
}

