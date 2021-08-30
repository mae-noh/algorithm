package programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class E10 {
	
	public static int solution (int n, int k) {
		
        StringBuilder sb = new StringBuilder();
        HashSet<Long> set = new HashSet<>();
        
        long num = n;
        int count = 0;

        while(true) {
            ++count;
            long remain = num%k;
            if(remain==0) break;

            if(!set.add(remain)) {
               count = -1;
               break;
            }

            sb.append(remain).append(n);
            num = Long.parseLong(sb.toString());
            sb.delete(0, sb.length());
        }

		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(22, 9));
	}
	
//	final static int MAX = 1000000000;
//
//	public static int solution(int n, int k) {
//		int answer = 0;
//		
//		StringBuffer sb = new StringBuffer(n+"");
//		StringBuffer nToString = new StringBuffer(n+"");
//		Set<BigInteger> set = new HashSet<>();
//		
//		int count=0;
//		BigInteger bigN = new BigInteger(""+n);
//		BigInteger bigK = new BigInteger(""+k);
//		boolean[] check = new boolean[MAX];
//		
//		while(true) {
//			BigInteger result = bigN.mod(bigK);
//			++count;
//			
//			if(result.equals(new BigInteger("0"))) break;
//			if(!set.add(result)) {
//				count = -1;
//				break;
//			}
//			sb.append(nToString);
//			bigN = new BigInteger(sb.toString());
//		}
//		
//		answer = count;
//		return answer;
//	}
//	
//	public static void main(String[] args) {
//		System.out.println(solution(22, 9));
//	}
	
}
