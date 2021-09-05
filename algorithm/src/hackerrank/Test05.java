package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result05 {

	/*
	 * Complete the 'bitwiseEquations' function below.
	 *
	 * The function is expected to return a LONG_INTEGER_ARRAY. The function accepts
	 * following parameters: 1. LONG_INTEGER_ARRAY a 2. LONG_INTEGER_ARRAY b
	 */

	public static List<Long> bitwiseEquations(List<Long> a, List<Long> b) {
		// Write your code here
		List<Long> answer = new ArrayList<>();
		for (int i = 0; i < a.size(); i++) {
			answer.add(solution(a.get(i), b.get(i)));
		}

		return answer;
	}

	private static Long solution(Long long1, Long long2) {

		long answer=0L;
		
		long x = 0;
		long y = long2;
		
		for(int i=0; i<long2; i++) {
			System.out.println(Long.toBinaryString(i|long2) + " " + (i|long2));
		}
		
		for(int i=0; i<60; i++) {
			x = 1L << i;
			y = long2 | x;
		}

		return answer;
	}

}

public class Test05 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		int aCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Long> a = IntStream.range(0, aCount).mapToObj(i -> {
			try {
				return bufferedReader.readLine().replaceAll("\\s+$", "");
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		}).map(String::trim).map(Long::parseLong).collect(toList());

		int bCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Long> b = IntStream.range(0, bCount).mapToObj(i -> {
			try {
				return bufferedReader.readLine().replaceAll("\\s+$", "");
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		}).map(String::trim).map(Long::parseLong).collect(toList());

		List<Long> result = Result05.bitwiseEquations(a, b);

		bufferedWriter.write(result.stream().map(Object::toString).collect(joining("\n")) + "\n");

		bufferedReader.close();
		bufferedWriter.close();
	}
}
