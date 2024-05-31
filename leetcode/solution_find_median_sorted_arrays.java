import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] merged = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, merged, 0, nums1.length);
        System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);
        Arrays.sort(merged);

        int idx = merged.length / 2;
        System.out.println(merged[idx-1]);
        System.out.println(merged[idx]);
        double median = (merged.length % 2 == 0) ? merged[idx-1] + merged[idx] / 2.0 : merged[idx];

        return median;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
    
        // Example 1
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        double output1 = solution.findMedianSortedArrays(nums1, nums2);
        System.out.println("Example 1:");
        System.out.println("nums1: " + Arrays.toString(nums1) + " nums2: " + Arrays.toString(nums2));
        System.out.println("Output: " + output1);
        
    }
}

// https://leetcode.com/problems/median-of-two-sorted-arrays/

/*
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
The overall run time complexity should be O(log (m+n)).

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106
*/
