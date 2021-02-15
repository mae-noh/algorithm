package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj1018 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		int N = Integer.valueOf(s[0]);
		int M = Integer.valueOf(s[1]);
		
		char[][] board = new char[N][M];
		
		for(int i=0; i<N; i++) {
			String st = br.readLine();
			for(int j=0; j<N; j++) {
				board[i][j] = st.charAt(j);
			}
		}
		
		char[][] chessW = {
				{'W','B','W','B','W','B','W','B'},
				{'B','W','B','W','B','W','B','W'},
				{'W','B','W','B','W','B','W','B'},
				{'B','W','B','W','B','W','B','W'},
				{'W','B','W','B','W','B','W','B'},
				{'B','W','B','W','B','W','B','W'},
				{'W','B','W','B','W','B','W','B'},
				{'B','W','B','W','B','W','B','W'}
				};
		char[][] chessB = {
				{'B','W','B','W','B','W','B','W'},
				{'W','B','W','B','W','B','W','B'},
				{'B','W','B','W','B','W','B','W'},
				{'W','B','W','B','W','B','W','B'},
				{'B','W','B','W','B','W','B','W'},
				{'W','B','W','B','W','B','W','B'},
				{'B','W','B','W','B','W','B','W'},
				{'W','B','W','B','W','B','W','B'},
				};
		
		int min=65;
		for(int i=0; i<=N-8; i++) {
			for(int j=0; j<=M-8; j++) {
				int minW=0, minB=0, x=0, y=0;
				for(int k=i; k<i+8; k++) {
					y=0;
					for(int l=j; l<j+8; l++) {
						System.out.println(x + " " + y);
						if(chessW[x][y] != board[k][l]) minW++;
						if(chessB[x][y] != board[k][l]) minB++;
						y++;
					}
					x++;
				}
				int tmp = minW > minB ? minB : minW;
				min = min > tmp ? tmp : min;
			}
		}
		
		bw.write(min + "");
		bw.close();
		br.close();
	}
}
