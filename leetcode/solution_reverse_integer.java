import java.math.BigInteger;

class Solution {
    public int reverse(int x) {
        
        // StringBuilder sb = new StringBuilder();
        // if(x < 0) sb.append('-');

        // x = Math.abs(x);
        // while(x >= 10) {
        //     sb.append(x % 10);
        //     System.out.println(x%10);
        //     x/=10;
        // }
        // sb.append(x);
        // System.out.println(x);

        long reversed = 0;
        boolean isNegative = x < 0;
        x = Math.abs(x);

        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        if (isNegative) {
            reversed = -reversed;
        }

        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) reversed;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example
        int x = 1534236469;
        int output1 = solution.reverse(x);
        System.out.println("Example 1:");
        System.out.println("x: " + x);
        System.out.println("Output: " + output1);
        
    }
}

/*
https://leetcode.com/problems/reverse-integer

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21

*/
