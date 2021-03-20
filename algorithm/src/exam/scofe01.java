package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class scofe01 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] s, start, dest;
		int start_h=0, start_m=0, dest_h=23, dest_m=59;
		for(int i=0; i<N; i++) {
			s = br.readLine().split("~");
			start = s[0].split(":");
			int tmp_h = Integer.parseInt(start[0]);
			int tmp_m = Integer.parseInt(start[1]);
			if(start_h < tmp_h) {
				start_h = tmp_h;
				start_m = tmp_m;
			}else if(start_h == tmp_h && start_m < tmp_m) {
				start_m = tmp_m;
			}

			dest = s[1].split(":");
			tmp_h = Integer.parseInt(dest[0]);
			tmp_m = Integer.parseInt(dest[1]);
			if(dest_h > tmp_h) {
				dest_h = tmp_h;
				dest_m = tmp_m;
			}else if(dest_h == tmp_h && dest_m > tmp_m) {
				dest_m = tmp_m;
			}
		}
		if(start_h > dest_h || start_h == dest_h && start_m > dest_m) System.out.println("-1");
		else System.out.printf("%02d:%02d~%02d:%02d", start_h, start_m, dest_h, dest_m);
	}
}
