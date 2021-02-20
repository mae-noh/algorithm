package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class boj2108 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.valueOf(br.readLine());
		int[] arr = new int[N];
		int[] sortedArr = null;
		int[] count = new int[8000+1];
		int[] sumCount = new int[8000+1];
		int sum = 0;
		for(int i=0; i<N; i++) {
			arr[i] = Integer.valueOf(br.readLine());
			arr[i] = arr[i] < 0 ? -arr[i] : arr[i]+4000;
			sum += arr[i];
			sumCount[arr[i]]++;
			count[arr[i]]++;
		}
		System.out.println("arr " + Arrays.toString(arr));
		System.out.println("count " + Arrays.toString(count));
		sortedArr = sortArr(arr, sumCount);
		System.out.println("sortedArr " + Arrays.toString(sortedArr));

		//산술평균 N개수의 합을 N으로 나눔
		sum /= N;
		bw.write(sum + "\n");

		//중앙값 오름차순 중간값
//		bw.write(sortedArr[N/2+1]+"\n");
//		
		//최빈값 가장많은 빈도수
		bw.write("\n");
		
		//범위 최솟값,최댓값
		bw.write(sortedArr[0] + " " + sortedArr[N-1] + "\n");
		
		bw.close();
		br.close();
	}

	private static int[] sortArr(int[] arr, int[] count) {
		int[] sortArr = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			count[arr[i]]++;
		}
		for(int i=1; i<count.length; i++) {
			count[i] += count[i-1]; 
		}
		System.out.println("a" + arr.length);
		for(int i=arr.length-2; i>=0; i--) {
			System.out.println(i);
			System.out.println(count[arr[i]]);
			sortArr[--(count[arr[i]])] = arr[i];
		}
		System.out.println("arr " + Arrays.toString(arr));
		System.out.println("count " + Arrays.toString(count));
		System.out.println("sortedArr " + Arrays.toString(sortArr));
		
		return sortArr;
	}
	
	
}
