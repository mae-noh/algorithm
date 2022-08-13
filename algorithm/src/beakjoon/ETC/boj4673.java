package beakjoon.ETC;

public class boj4673 {

	public static void main(String[] args) {
		int N = 10001;
		boolean[] checkArr = new boolean[N];
		for(int i=1; i<N; i++) {
			int selfNum = checkSelfNum(i);
			if(selfNum <= 10000) {
				checkArr[selfNum] = true;
			}
		}
		for(int i=1; i<N; i++) {
			if(!checkArr[i]) {
				System.out.println(i);
			}
		}
	}
	
	static int checkSelfNum(int num) {
		int result = num;
		while(num>0) {
			result += num%10;
			num/=10;
		}
		return result;
	}
	
}
