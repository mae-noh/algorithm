import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class solution_move_zeros {

    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int nonZeroIndex = 0;

        for(int i=0; i<n; i++) {
            if(nums[i]!=0){
                nums[nonZeroIndex++] = nums[i];
            }
        }

        for(int i=nonZeroIndex; i<n; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        solution_move_zeros solution = new solution_move_zeros();
    
        int[] nums;

        // Example 1
        nums = new int[]{0,1,0,3,12};
        solution.moveZeroes(nums);
        System.out.println("Example 1");
        System.out.println("Output1: " + Arrays.toString(nums));

        // Example 2
        nums = new int[]{0};
        solution.moveZeroes(nums);
        System.out.println("Example 2");
        System.out.println("Output2: " + Arrays.toString(nums));
    }
}

// https://leetcode.com/problems/move-zeroes/description/

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