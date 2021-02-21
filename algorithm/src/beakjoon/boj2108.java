package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj2108 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.valueOf(br.readLine());
		int[] arr = new int[N];
		int[] count = new int[8000+1];
		double sum = 0;
		for(int i=0; i<N; i++) {
			arr[i] = Integer.valueOf(br.readLine());
			sum += arr[i];
			arr[i] = arr[i]+4000;
			count[arr[i]]++;
		}
		int modIdx = mod(count);
		int[] sortedArr = sortArr(arr, count);
		
		//산술평균 N개수의 합을 N으로 나눔
		sum /= N;
		sum = sum < 0 ? sum-0.5 : sum+0.5;
		bw.write((int)sum + "\n");

		//중앙값 오름차순 중간값
		bw.write(sortedArr[N/2]+"\n");
		
		//최빈값	
		bw.write(modIdx-4000 + "\n");
			
		//범위 최솟값,최댓값
		int range = sortedArr[N-1]-sortedArr[0];
		range = range < 0 ? -range : range;
		bw.write(range + "\n");
		
		bw.close();
		br.close();
	}
	
	private static int mod(int[] count) {
		int max=0, modIdx=0;
		for(int i=0; i<8001; i++) {
			if(max <= count[i]) {
				max = count[i];
				modIdx = i;
			}
		}
		int cnt=0;
		for(int i=0; i<=modIdx; i++) {
			if(cnt == 2) {
				modIdx = i-1;
				break;
			}
			if(count[i] == max) cnt++;
		}
		return modIdx;
	}

	private static int[] sortArr(int[] arr, int[] count) {
		int[] sortArr = new int[arr.length];
		for(int i=1; i<count.length; i++) {
			count[i] += count[i-1]; 
		}

		for(int i=arr.length-1; i>=0; i--) {
			sortArr[--count[arr[i]]] = arr[i];
		}
		for(int i=0; i<sortArr.length; i++) {
			sortArr[i] -= 4000;
		}
		return sortArr;
	}
	
	
}
