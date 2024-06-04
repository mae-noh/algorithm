import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class solution_pascals_triangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();

        int[][] dp = new int[numRows][numRows];
        for (int i = 0; i < numRows; i++)
            Arrays.fill(dp[i], 1);

        for(int i=0; i<numRows; i++) {
            List<Integer> arrRow = new ArrayList<Integer>();
            for(int j=0; j<i+1; j++) {
                int y = i - j ;
                int x = j;

                if(x == 0 || y == 0) {
                    arrRow.add(1);
                    continue;
                }

                dp[y][x] = dp[y-1][x] + dp[y][x-1];
                arrRow.add(dp[y][x]);
            }
            list.add(arrRow);
        }
        return list;
    }

    public static void main(String[] args) {
        solution_pascals_triangle solution = new solution_pascals_triangle();
    
        // Example 1
        List<List<Integer>> output1 = solution.generate(5);
        System.out.println("Example 1");
        System.out.println("Output1: " + output1);        

        // Example 2
        List<List<Integer>> output2 = solution.generate(1);
        System.out.println("Example 2");
        System.out.println("Output2: " + output2);        
        
    }
}

/*
https://leetcode.com/problems/pascals-triangle

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

Input: numRows = 1
Output: [[1]]
 */