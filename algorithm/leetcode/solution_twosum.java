class Solution {
    public int[] twoSum(int[] nums, int target) {
        int p1, p2 = 0;
        
        int lastIndex = nums.length;
        for(int i=0; i<lastIndex; i++) {
            for(int j=i+1; j<lastIndex; j++) {
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }
}

// https://leetcode.com/problems/two-sum/