import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class solution_find_peek_element{
    public int findPeakElement(int[] nums) {

        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numsMap.put(nums[i], i);
        }

        // Create a list of indices
        List<Integer> indices = new ArrayList<>(numsMap.values());
        
        // Sort indices based on the corresponding values in the nums array
        indices.sort(Comparator.comparingInt(index -> nums[index]));
        
        // Retrieve the last index after sorting
        int lastIndex = indices.get(indices.size() - 1);
        int lastValue = nums[lastIndex];
        int originalIndex = numsMap.get(lastValue);
        
        // Print the last value and its original index
        System.out.println("Last Value: " + lastValue + ", Original Index: " + originalIndex);
        

        return 0;
    }

    public static void main(String[] args) {
        // Example 1
        solution_find_peek_element solution = new solution_find_peek_element();
        int output1 = solution.findPeakElement(new int[]{1,2,3,1});
        System.out.println("Example 1");
        System.out.println("Output1: " + output1);

        // Example 2
        int output2 = solution.findPeakElement(new int[]{1,2,1,3,5,6,4});
        System.out.println("Example 2");
        System.out.println("Output2: " + output2);

        // Example 3
        // int[] output3 = solution.successfulPairs();
        // System.out.println("Example 3");
        // System.out.println("Output3: " + output3);       
    }
}
// https://leetcode.com/problems/guess-number-higher-or-lower/description/
