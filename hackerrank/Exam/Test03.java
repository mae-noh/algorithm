package hackerrank.Exam;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.IntStream;

class Result03 {

	/*
	 * Complete the 'countMatches' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. STRING_ARRAY grid1 2. STRING_ARRAY grid2
	 */
	public static Set<String> visited;
	public static Set<String> set;
	public static int M;
	public static int N;
	public static int[] dx = {-1,0,1,0};
	public static int[] dy = {0,1,0,-1};
	public static int countMatches(List<String> grid1, List<String> grid2) {
		// Write your code here
		
		M = grid1.size();
		N = grid1.get(0).length();
				
		int count=0;
		
		List<String> res1 = get_isLands(grid1);
		List<String> res2 = get_isLands(grid2);
				
		for(int i=0; i<res1.size(); i++) {
			if(res2.contains(res1.get(i))) count++;
		}
		
		return count;
	}
	
	public static List<String> get_isLands(List<String> grid){
		
		List<String> res = new ArrayList<>();
		visited = new HashSet<>();
		
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				if(grid.get(i).charAt(j) == '1' & !visited.contains(i + " " + j)) {
					set = new TreeSet<>();
					dfs(grid, i, j, set);
					visited.addAll(set);
					res.add(set.toString());
				}
			}
		}
		
		return res;
	}
	
	public static void dfs(List<String> grid, int x, int y, Set<String> set) {
		set.add(x + " " + y);
		for(int i=0; i<4; i++) {
			int nextX = x + dx[i];
			int nextY = y + dy[i];
			if(nextX < 0 || nextX >= M || nextY < 0 || nextY >= N) continue;
			if(grid.get(nextX).charAt(nextY) == '1' && !set.contains(nextX + " " + nextY)) {
				dfs(grid, nextX, nextY, set);
			}
		}
	}

}

public class Test03 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		int grid1Count = Integer.parseInt(bufferedReader.readLine().trim());

		List<String> grid1 = IntStream.range(0, grid1Count).mapToObj(i -> {
			try {
				return bufferedReader.readLine();
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		}).collect(toList());

		int grid2Count = Integer.parseInt(bufferedReader.readLine().trim());

		List<String> grid2 = IntStream.range(0, grid2Count).mapToObj(i -> {
			try {
				return bufferedReader.readLine();
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		}).collect(toList());

		int result = Result03.countMatches(grid1, grid2);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
