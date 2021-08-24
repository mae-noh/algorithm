package hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java24{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			
          	//Write your code here
			String pattern = "<(.+)>([^<]+)</\\1>";
			Pattern p = Pattern.compile(pattern);
			Matcher m = p.matcher(line);
			
			boolean flag = false;
			while(m.find()) {
				System.out.println(m.group(2));
			}			
			System.out.println("None");
			
			testCases--;
		}
	}
}
