package exam;

import java.util.Arrays;

public class skill2_01 {

	public static void main(String[] args) {
		System.out.println(solution(8, 12));
	}

	public static long gcd(long num1, long num2){
        if(num2==0) return num1;
        else return gcd(num2, num1%num2);
    }

    public static long solution(int w, int h) {
        long answer = 1;
        long lw = (long) w;
        long lh = (long) h;

        long gcd = gcd(lw, lh);
        if(gcd==1) answer = lw+lh-1;
        if(gcd!=1) answer = lw+lh-gcd;

        return lw*lh - answer;
    }
}
