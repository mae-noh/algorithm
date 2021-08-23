package hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java10 {

	
	static int B = 0;
	static int H = 0;
	private static boolean flag;

	static {
		Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        try {
        	if(B < 0 || H < 0) {
        		flag = false;
        		throw new Exception();
        	}	
        }
        catch(Exception e)
        {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
	}
	
	public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main
}
