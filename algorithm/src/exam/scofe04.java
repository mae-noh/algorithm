package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class scofe04 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double[] prefer = new double[5];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<prefer.length; i++) {
			prefer[i] = Double.parseDouble(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		char[][][] contents = new char[2][N][M];
		String s;
		for(int i=0; i<2; i++) {
			for(int j=0; j<N; j++) {
				s=br.readLine();
				for(int k=0; k<M; k++) {
					contents[i][j][k] = s.charAt(k);
				}
			}
		}
		
		ArrayList<double[]> arr = new ArrayList<>();
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(contents[0][i][j] == 'Y') arr.add(new double[] {'Y', prefer[contents[1][i][j]-'A'], i, j});
				else if(contents[0][i][j] == 'O') arr.add(new double[] {'O', prefer[contents[1][i][j]-'A'], i, j});
				else if(contents[0][i][j] == 'W') arr.add(new double[] {'W', prefer[contents[1][i][j]-'A'], i, j});	
			}
		}
		arr.sort((o1,o2)->{
			if(o1[0] == o2[0]) return Double.compare(o2[1], o1[1]);
			else return Double.compare(o2[0], o1[0]);
		});
		
		for(int i=0; i<arr.size(); i++) {
			System.out.println((char)arr.get(i)[0]+ " " + arr.get(i)[1] + " " + (int)arr.get(i)[2] + " " + (int)arr.get(i)[3]);
		}
	}
}
