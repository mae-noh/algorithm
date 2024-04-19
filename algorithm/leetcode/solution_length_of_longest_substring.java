import java.util.Set;
import java.util.HashSet;

class Solution {
    
    // two pointer
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int maxLength = 0, left = 0, right = 0;

        while(right < n) {
            char ch = s.charAt(right);
            if(!set.contains(ch)){
                set.add(ch);
                maxLength = Math.max(maxLength, set.size());
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
    }

    // 시간 초과 코드
    // public int lengthOfLongestSubstring(String s) {
    //     int length = s.length();
    //     int maxLength = 0;
    //     LinkedHashSet<Character> currentSubstring = new LinkedHashSet<>();
    //     for(int i=0; i<length; i++) {
    //         for(int j=i; j<length; j++) {
    //             char ch = s.charAt(j);
    //             if(currentSubstring.contains(ch)) {
    //                 if(maxLength < currentSubstring.size()) {
    //                     maxLength = currentSubstring.size();
    //                 }
    //                 currentSubstring.clear();
    //             }
    //             currentSubstring.add(ch);
    //         }
    //         if(maxLength < currentSubstring.size()){
    //             maxLength = currentSubstring.size();
    //         }
    //         currentSubstring.clear();
    //     }
    //     return Math.max(maxLength, currentSubstring.size());
    // }

    public static void main(String[] args) {
        Solution solution = new Solution();
    
        // Example 1
        String input1 = "abcabcbb";
        int output1 = solution.lengthOfLongestSubstring(input1);
        System.out.println("Example 1:");
        System.out.println("Input: " + input1);
        System.out.println("Output: " + output1); // 예상 출력: 3
    
        // Example 2
        String input2 = "jbpnbwwd";
        int output2 = solution.lengthOfLongestSubstring(input2);
        System.out.println("\nExample 2:");
        System.out.println("Input: " + input2);
        System.out.println("Output: " + output2); // 예상 출력: 4 

        // Example 3
        String input3 = " ";
        int output3 = solution.lengthOfLongestSubstring(input3);
        System.out.println("\nExample 3:");
        System.out.println("Input: " + input3);
        System.out.println("Output: " + output3); // 예상 출력: 1
    }
}

// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

/*

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

*/
