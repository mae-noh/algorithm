class solution_best_time_to_buy_and_sell_stock {

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;

        int left = 0;
        int maxProfit = 0;

        for(int right=1; right<prices.length; right++) {
            if(prices[right] > prices[left]) {
                maxProfit = Math.max(maxProfit, prices[right]-prices[left]);
            } else {
                left = right;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        solution_best_time_to_buy_and_sell_stock solution = new solution_best_time_to_buy_and_sell_stock();
    
        // Example 1
        int output1 = solution.maxProfit(new int[] {7,1,5,3,6,4});
        System.out.println("Example 1");
        System.out.println("Output1: " + output1);        

        // Example 2
        int output2 = solution.maxProfit(new int[] {5,4,3,2,1});
        System.out.println("Example 2");
        System.out.println("Output2: " + output2);        
        
    }
}

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/