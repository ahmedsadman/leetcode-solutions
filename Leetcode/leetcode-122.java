class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0)
            return 0;

        int peak = prices[0];
        int valley = prices[0];
        int i = 0;
        int maxProfit = 0;

        while (i < prices.length - 1) {
            // valley
            while (i < prices.length - 1 && prices[i] >= prices[i + 1])
                i++;
            valley = prices[i];

            // peak
            while (i < prices.length - 1 && prices[i] <= prices[i + 1])
                i++;
            peak = prices[i];

            maxProfit += peak - valley;
        }

        return maxProfit;
    }
}