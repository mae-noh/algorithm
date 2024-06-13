import java.util.Arrays;

public class solution_successful_pairs_of_spells_and_potions{
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        
        int left = 0;
        int right = potions.length - 1;

        Arrays.sort(potions);
        int index = -1;

        while(left<=right) {
            int mid = left + (right-left)/2;
            if (potions[mid] >= success) {
                index = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        // Example 1
        solution_successful_pairs_of_spells_and_potions solution = new solution_successful_pairs_of_spells_and_potions();
        int[] output1 = solution.successfulPairs(new int[]{5,1,3}, new int[]{1,2,3,4,5}, 7);
        System.out.println("Example 1");
        System.out.println("Output1: " + output1);

        // Example 2
        int[] output2 = solution.successfulPairs(new int[]{3,1,2}, new int[]{8,5,8}, 16);
        System.out.println("Example 2");
        System.out.println("Output2: " + output2);

        // Example 3
        // int[] output3 = solution.successfulPairs();
        // System.out.println("Example 3");
        // System.out.println("Output3: " + output3);       
    }
}
// https://leetcode.com/problems/guess-number-higher-or-lower/description/
