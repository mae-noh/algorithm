package algorithm;

public class boj4673 {

	public static void main(String[] args) {
		int N = 10000;
		int[] a = checkSelfNum(N);
		for(int i=1; i<=N; i++) {
			if(a[i] == 0) {
				System.out.println(i);
			}
		}
	}
	
	static int[] checkSelfNum(int num) {
		int a[] = new int[num+1];
		int tmp = 0;
		for(int i=1; i<=num; i++) {
			tmp = 0;
			tmp += i;
			int index = i;
			while(index>0) {
				tmp += index%10;
				index/=10;
			}
			if(tmp<=10000) {
				a[tmp]++;
			}
		}

		return a;
	}
	
	
}
