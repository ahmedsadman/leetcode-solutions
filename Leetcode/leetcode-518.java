class Solution {
    // This is solution from leetcode premium
    // This video explains it:
    // https://www.youtube.com/watch?v=jaNZ83Q3QGc

    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;

        for (int coin : coins) {
            for (int x = coin; x <= amount; x++)
                dp[x] += dp[x - coin];
        }

        return dp[amount];
    }
}