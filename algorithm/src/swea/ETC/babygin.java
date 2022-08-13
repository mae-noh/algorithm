package swea.ETC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class babygin {
	static int[] num = new int[10];
	static ArrayList<Integer> arr = new ArrayList<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<6; i++) {
			num[Integer.parseInt(st.nextToken())]++;
		}
		dfs(0);
	}
	private static void dfs(int i) {
		if(i == 6) {
			System.out.println(arr);
		}
		
		for(int j=0; j<10; j++) {
			if(num[j] > 0) {
				num[j]--;
				arr.add(j);
				dfs(i+1);
				arr.remove(arr.size()-1);
				num[j]++;
			}
		}
	}
	
}
