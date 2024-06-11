import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class solution_unique_paths {

    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];

        dp[1][1] = 1;

        for(int i=1; i<m+1; i++) {
            for(int j=1; j<n+1; j++) {
                if (i == 1 && j == 1) {
                    continue;
                }        
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        solution_unique_paths solution = new solution_unique_paths();
    
        // Example 1
        int output1 = solution.uniquePaths(3, 7);
        System.out.println("Example 1");
        System.out.println("Output1: " + output1);

        // Example 2
        int output2 = solution.uniquePaths(3, 2);
        System.out.println("Example 2");
        System.out.println("Output2: " + output2);
    }
}

// https://leetcode.com/problems/unique-paths/description/

/*
예시 1:

입력: 숫자 = [0,1,0,3,12]
 출력: [1,3,12,0,0]
예 2:

입력: 숫자 = [0]
 출력: [0]
 

제약:

1 <= nums.length <= 10^4
-2^31 <= nums[i] <= 2^31 - 1
*/