class solution_climbing_stairs {

    public int climbStairs(int n) {
        if(n <= 1) return 1;

        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i=2; i<=n; i++) {
            dp[i] = dp[i-1] + dp[i-2];        
        };

        return dp[n];
    }

    public static void main(String[] args) {
        solution_climbing_stairs solution = new solution_climbing_stairs();
    
        // Example 1
        int output1 = solution.climbStairs(2);
        System.out.println("Example 1");
        System.out.println("Output1: " + output1);        

        // Example 2
        int output2 = solution.climbStairs(3);
        System.out.println("Example 2");
        System.out.println("Output2: " + output2);        
        
    }
}

// https://leetcode.com/problems/climbing-stairs/description/
