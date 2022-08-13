package swea.Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1225 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int[] dx = {1,2,3,4,5};
		Queue<Integer> q = new LinkedList<>();
		for(int testCase=1; testCase<=10; testCase++) {
			br.readLine();
			st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				q.offer(Integer.parseInt(st.nextToken()));
			}
			boolean flag = true;
			while(flag) {
				for(int i=0; i<dx.length; i++) {
					int next = q.poll() - dx[i];
					if(next <= 0) {
						q.offer(0);
						flag = false;
						break;
					}
					q.offer(next);
				}
			}
			StringBuffer answer = new StringBuffer();
			while(!q.isEmpty()) {
				answer.append(q.poll() + " ");
			}
			System.out.println("#"+ testCase +" "+answer);
		}
	}
}
