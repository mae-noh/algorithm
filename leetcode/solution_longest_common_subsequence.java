import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class solution_longest_common_subsequence {

    public int longestCommonSubsequence(String text1, String text2) {

        int m = text1.length();
        int n = text2.length();

        int[][] dp = new int[m+1][n+1];

        for(int i=1; i<m+1; i++) {
            for(int j=1; j<n+1; j++) {
                if(text1.charAt(i-1) == text2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1]+1;
                } else {
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        System.out.println(Arrays.deepToString(dp));

        return dp[m][n];
    }

    public static void main(String[] args) {
        solution_longest_common_subsequence solution = new solution_longest_common_subsequence();
    
        // Example 1
        int output1 = solution.longestCommonSubsequence("abcde", "ace");
        System.out.println("Example 1");
        System.out.println("Output1: " + output1);

        // Example 2
        int output2 = solution.longestCommonSubsequence("abcba", "abcbcba");
        System.out.println("Example 2");
        System.out.println("Output2: " + output2);

        /* "abcba"
            "abcbcba"
        */
    }
}

// https://leetcode.com/problems/longest-common-subsequence/description/

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