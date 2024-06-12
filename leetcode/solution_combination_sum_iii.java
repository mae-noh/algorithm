import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class solution_combination_sum_iii {

    public List<List<Integer>> combinationSum3(int k, int n) {
        
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        int[] nums = {1,2,3,4,5,6,7,8,9};
        
        recursive(nums, 0, k, n, l, list);
        
        return list;
    }

    public void recursive(int[] num, int index, int k, int n, List<Integer> l, List<List<Integer>> list) {
        if(l.size() == k && n == 0) {
            list.add(new ArrayList<>(l));
            System.out.println(new ArrayList<>(l));
            return;
        }

        for(int i=index; i<9; i++) {
            l.add(num[i]);
            recursive(num, i+1, k, n-num[i], l, list);
            l.remove(l.size()-1);
        }
    }

    public static void main(String[] args) {
        solution_combination_sum_iii solution = new solution_combination_sum_iii();
    
        // Example 1
        // List<List<Integer>> output1 = solution.combinationSum3(3, 7);
        // System.out.println("Example 1");
        // System.out.println("Output1: " + output1);

        // Example 2
        List<List<Integer>> output2 = solution.combinationSum3(3,9);
        System.out.println("Example 2");
        System.out.println("Output2: " + output2);

        // Example 3
        // List<List<Integer>> output3 = solution.combinationSum3(4,1);
        // System.out.println("Example 3");
        // System.out.println("Output3: " + output3);
       
    }
}

// https://leetcode.com/problems/combination-sum-iii/description/
