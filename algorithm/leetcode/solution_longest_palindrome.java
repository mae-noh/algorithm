class Solution {
    public String longestPalindrome(String s) {
        int length = s.length();
        int maxLength = 0;
        int start = 0, end = 0;
    
        for (int i = 0; i < length; i++) {
            int oddPalindrome = expandAroundCenter(s, i, i);
            int evenPalindrome = expandAroundCenter(s, i, i + 1);
            int curLength = Math.max(oddPalindrome, evenPalindrome);
            if (curLength > maxLength) {
                maxLength = curLength;
                start = i - (curLength - 1) / 2;
                end = i + curLength / 2;
            }
        }
    
        return s.substring(start, end + 1);
    }
    
    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
            Solution solution = new Solution();
        
            // Example 1
            String s = "abb";
            String output1 = solution.longestPalindrome(s);
            System.out.println("Example 1:");
            System.out.println("s: " + s);
            System.out.println("Output: " + output1);
            
        }
    }
}

/*
Given a string s, return the longest palindromic substring in s.

Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"
 

Constraints:
1 <= s.length <= 1000
s consist of only digits and English letters.
*/
