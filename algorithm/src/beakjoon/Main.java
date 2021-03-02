package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	   public static void main(String[] args) throws NumberFormatException, IOException{
		      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		      int N = Integer.parseInt(br.readLine());
		      
		      long[] length = new long[N-1];
		      long[] fuelPrice = new long[N];
		      
		      StringTokenizer st = new StringTokenizer(br.readLine());
		      for (int i = 0; i < length.length; i++) {
		         length[i] = Long.parseLong(st.nextToken());
		      }
		      
		      st = new StringTokenizer(br.readLine());
		      for (int i = 0; i < fuelPrice.length; i++) {
		         fuelPrice[i] = Long.parseLong(st.nextToken());
		      }
		      
		      long cost = 0;
		      long tmpPrice = fuelPrice[0];
		      for (int i = 0; i < fuelPrice.length-1; i++) {
		         
		    	 System.out.println(tmpPrice + " " + length[i]);
		         cost += tmpPrice * length[i];		         
		         
		         if(fuelPrice[i] > fuelPrice[i+1]) {
		            tmpPrice = fuelPrice[i+1];
		         }
		         
		      }
		      
		      bw.write("" + cost);
		      bw.close();
		   }

	
}

