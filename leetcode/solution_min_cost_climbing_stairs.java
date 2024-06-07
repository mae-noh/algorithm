import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class solution_min_cost_climbing_stairs {

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] minOfCost = Arrays.copyOf(cost, n+1);


        for(int i=2; i<=n; i++) {
            minOfCost[i] = minOfCost[i] + Math.min(minOfCost[i-1], minOfCost[i-2]);
        }

        return minOfCost[n];
    }

    public static void main(String[] args) {
        solution_min_cost_climbing_stairs solution = new solution_min_cost_climbing_stairs();
    
        // Example 1
        int output1 = solution.minCostClimbingStairs(new int[]{10,15,20});
        System.out.println("Example 1");
        System.out.println("Output1: " + output1);

        // Example 2
        int output2 = solution.minCostClimbingStairs(new int[]{1,100,1,1,1,100,1,1,100,1});
        System.out.println("Example 2");
        System.out.println("Output2: " + output2);
    }
}

// https://leetcode.com/problems/min-cost-climbing-stairs/description/

/*
 * java.lang.ArrayIndexOutOfBoundsException: 인덱스 1이 5행에서 길이 1의 범위를 벗어남, Solution.tribonacci가 56행, __DriverSolution__.__helper__(86행), __Driver__.main
 */