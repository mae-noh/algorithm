package exam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class scofe03 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		char[][] space = new char[N][N];
		for(int i=0; i<N; i++) {
			String s = br.readLine();
			for(int j=0; j<N; j++) {
				space[i] = s.toCharArray();
			}
		}
		int total = 0;
		int[] size = new int[N];
		for(int i=0; i<N; i++) {
			size[i] = countSpace(i+1, space);
			total += size[i];
		}
		
		bw.write("total: " + total +"\n");
		for(int i=1; i<=N; i++) {
			if(size[i-1] == 0) continue;
			bw.write("size["+i+"]: " + size[i-1]+"\n");
		}
		bw.close();
		br.close();
	}

	private static int countSpace(int n, char[][] space) {
		int cnt=0;
		for(int i=0; i<space.length; i++) {
			for(int j=0; j<space.length; j++) {
				int tmp=0;
				if(i+n > space.length || j+n > space.length) continue;
				for(int k=i; k<i+n; k++) {
					int l=j;
					for(l=j; l<j+n; l++) {
						if(space[k][l] == '0') break;
						tmp++;
					}
					if(l!=j+n) break;
				}
				if(tmp == n*n) cnt++;
				tmp=0;
			}
		}
		return cnt;
	}
}
