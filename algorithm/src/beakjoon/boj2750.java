	package beakjoon;
	
	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.io.OutputStreamWriter;
	import java.util.LinkedList;
	
	public class boj2750 {
	
		public static void main(String[] args) throws NumberFormatException, IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int N = Integer.valueOf(br.readLine());
			LinkedList<Integer> list = new LinkedList<>();
			for(int i=0; i<N; i++) {
				int num = Integer.valueOf(br.readLine());
				int j=0;
				for(j=0; j<i; j++) {
					if(num < list.get(j)) break;
				}
				list.add(j, num);
			}
			for(int i : list) {
				bw.write(i + "\n");
			}
			bw.close();
			br.close();
		}
		
	}
