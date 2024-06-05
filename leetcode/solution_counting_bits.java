import java.util.Arrays;

class solution_counting_bits {

    public int[] countBit(int n) {
        int[] dp = new int[n+1];

        for(int i=1; i<=n; i++) {
            if(i%2 == 0) {
                dp[i] = dp[i/2];
            } else {
                dp[i] = dp[i/2]+1;
            }
        }

        return dp;
    }

    public static void main(String[] args) {
        solution_counting_bits solution = new solution_counting_bits();
    
        // Example 1
        int[] output1 = solution.countBit(5);
        System.out.println("Example 1");
        System.out.println("Output1: " + Arrays.toString(output1));        

        // Example 2
        int[] output2 = solution.countBit(0);
        System.out.println("Example 2");
        System.out.println("Output2: " + Arrays.toString(output2));        
        
    }
}

// https://leetcode.com/problems/counting-bits/description/

/*
 * 
 * Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.
 
Example 1:

Input: n = 2
Output: [0,1,1]
Explanation:
0 --> 0
1 --> 1
2 --> 10
Example 2:

Input: n = 5
Output: [0,1,1,2,1,2]
Explanation:
0 --> 0
1 --> 1
2 --> 10
3 --> 11
4 --> 100
5 --> 101

 */