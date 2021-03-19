package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	   public static void main(String[] args) throws NumberFormatException, IOException{
		  
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String[] input = br.readLine().split(" ");
			int N = Integer.parseInt(input[0]);
			int K = Integer.parseInt(input[1]);
			input = br.readLine().split(" ");
			int[] arr = new int[N];
			for(int i=0; i<N; i++){
				arr[i] = Integer.parseInt(input[i]);
			}
			int result = (int)(Math.abs((N-1.0)/(K-1.0)));
			System.out.println(result);
		
	   }

}

