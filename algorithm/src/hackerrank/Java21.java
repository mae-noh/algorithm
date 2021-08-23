package hackerrank;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Java21{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here
class MyRegex{
	String pattern = "\\b([01]?\\d{1,2}|2[0-4]\\d|25[0-5])\\."
	        + "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])\\."
	        + "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])\\."
	        + "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])\\b";
}