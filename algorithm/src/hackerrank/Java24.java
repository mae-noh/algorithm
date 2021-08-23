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
			if(line.matches(pattern)) line = line.replaceAll(pattern, "");
			else line = "None";
			
			System.out.println(line);
			
			testCases--;
		}
	}
}
