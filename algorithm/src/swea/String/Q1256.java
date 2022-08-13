package swea.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q1256 {

public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer="";
		br.readLine();
		for(int testCase=1; testCase<=10; testCase++) {
			int index = Integer.parseInt(br.readLine());
			String st = br.readLine();
			answer = Solution(index, st);
			System.out.println("#" + testCase + " " + answer);
		}
		
	}

	private static String Solution(int index, String st) {
		ArrayList<String> list = new ArrayList<>();
		if(index >= st.length()) return "none";
		
		for(int i=0; i<=st.length(); i++) {
			list.add(st.substring(i, st.length()));
		}
		list.sort(null);
		return list.get(index);
	}
	
}
