import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class solution_house_robber {

    public int rob(int[] nums) {
        int n = nums.length;
        int[] newArray = new int[n + 1];
    
        System.arraycopy(nums, 0, newArray, 1, nums.length);

        for(int i=3; i<=n; i++){
            newArray[i] += Math.max(newArray[i-2], newArray[i-3]);
        }
        
        Arrays.sort(newArray);

        return newArray[n];
    }

    public static void main(String[] args) {
        solution_house_robber solution = new solution_house_robber();
    
        // Example 1
        int output1 = solution.rob(new int[]{1,2,3,1});
        System.out.println("Example 1");
        System.out.println("Output1: " + output1);

        // Example 2
        int output2 = solution.rob(new int[]{2,7,9,3,1});
        System.out.println("Example 2");
        System.out.println("Output2: " + output2);
    }
}

// https://leetcode.com/problems/house-robber/description/

/*
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.

 

Example 1:

Input: nums = [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
Total amount you can rob = 1 + 3 = 4.
Example 2:

Input: nums = [2,7,9,3,1]
Output: 12
Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
Total amount you can rob = 2 + 9 + 1 = 12.
 

Constraints:

1 <= nums.length <= 100
0 <= nums[i] <= 400
 */