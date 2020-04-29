// LeetCode 121 - Best time to buy and sell stock

class Solution {
    public int maxProfit(int[] prices) {
        // check for empty input
        if (prices.length == 0)
            return 0;

        int buyingPrice = prices[0];
        int sellingPrice = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buyingPrice) {
                buyingPrice = prices[i];
                sellingPrice = prices[i];
            }

            if (prices[i] > sellingPrice) {
                sellingPrice = prices[i];
            }

            profit = Math.max(profit, sellingPrice - buyingPrice);
        }

        // System.out.println("Buy Price: " + String.valueOf(buyingPrice));
        // System.out.println("Sell Price: " + String.valueOf(sellingPrice));

        return profit;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] prices = { 7, 6, 4, 3, 1 };
        // int[] prices = { 7, 1, 5, 3, 6, 4 };
        // int[] prices = { 2, 4, 1 };
        System.out.println(sol.maxProfit(prices));
    }
}