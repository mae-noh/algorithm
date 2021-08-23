package hackerrank;
import java.util.Scanner;

public class Java18 {

    static boolean isAnagram(String a, String b) {
        // Complete the function
    	    	
    	char[] charA = a.toUpperCase().toCharArray();
    	char[] charB = b.toUpperCase().toCharArray();
    	
    	java.util.Arrays.sort(charA);
    	java.util.Arrays.sort(charB);
    	    	
    	return java.util.Arrays.equals(charA, charB);
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
