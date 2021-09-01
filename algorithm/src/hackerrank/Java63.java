package hackerrank;

import java.util.Scanner;

public class Java63 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner scanner = new Scanner(System.in);
    	String st = scanner.nextLine();
    	System.out.println(solution(st));
    }

	private static String solution(String st) {
		// TODO Auto-generated method stub
		java.security.MessageDigest md;
		try {
			md = java.security.MessageDigest.getInstance("SHA-256");
		}
		catch(Exception e) {
			return null;
		}
		md.update(st.getBytes());
		byte byteData[] = md.digest();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < byteData.length; i++) {
            sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }
		        
		return sb.toString();
	}
}