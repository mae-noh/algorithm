import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class solution_best_time_to_buy_and_sell_stock_with_transaction_fee {

    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int[] hold = new int[n];
        int[] sell = new int[n];

        hold[0] = -prices[0];
        for(int i=1; i<n; i++) {
            hold[i] = Math.max(hold[i-1], sell[i-1]-prices[i]);
            sell[i] = Math.max(sell[i-1], hold[i-1]+prices[i]-fee);
        }

        return Math.max(hold[n-1],sell[n-1]);
    }

    public static void main(String[] args) {
        solution_best_time_to_buy_and_sell_stock_with_transaction_fee solution = new solution_best_time_to_buy_and_sell_stock_with_transaction_fee();
    
        // Example 1
        int output1 = solution.maxProfit(new int[] {1,3,2,8,4,9}, 2);
        System.out.println("Example 1");
        System.out.println("Output1: " + output1);

        // Example 2
        int output2 = solution.maxProfit(new int[] {1,3,7,5,10,3}, 3);
        System.out.println("Example 2");
        System.out.println("Output2: " + output2);

    }
}

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/description/