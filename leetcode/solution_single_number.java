class solution_single_number {

    public int singleNumber(int[] nums) {
        int n = nums.length;
        int result = 0;
        for(int i=0; i<n; i++){
            result ^= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        solution_single_number solution = new solution_single_number();
    
        // Example 1
        int output1 = solution.singleNumber(new int[] {2,2,1});
        System.out.println("Example 1");
        System.out.println("Output1: " + output1);

        // Example 2
        int output2 = solution.singleNumber(new int[] {4,1,2,1,2});
        System.out.println("Example 2");
        System.out.println("Output2: " + output2);

        // Example 3
        int output3 = solution.singleNumber(new int[] {1});
        System.out.println("Example 3");
        System.out.println("Output3: " + output3);
    }
}

// https://leetcode.com/problems/single-number/description/
