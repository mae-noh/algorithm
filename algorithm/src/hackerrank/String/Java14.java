package hackerrank.String;
import java.io.*;
import java.util.*;

public class Java14 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        int sum = A.length() + B.length();
        String flag = "Yes";
        
        int min = A.length() > B.length() ? B.length() : A.length();
        for(int i=0; i<min; i++) {
        	if(A.charAt(i) > B.length()) {
        		flag = "No";
        		break;
        	}
        }        
        System.out.println(sum);
        System.out.println(flag);
        System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1, A.length())+" "+B.substring(0, 1).toUpperCase()+B.substring(1, B.length()));
    }
    
}



