class Solution {
    // https://www.youtube.com/watch?v=JXBwuL4pL4o
    private int[][] dp;
    private int[][] dungeon;
    private int h;
    private int w;

    public int calculateMinimumHP(int[][] dungeon) {
        dp = new int[dungeon.length + 1][dungeon[0].length + 1];
        this.dungeon = dungeon;
        this.h = dungeon.length;
        this.w = dungeon[0].length;

        for (int i = 0; i < dp.length; i++)
            for (int j = 0; j < dp[0].length; j++)
                dp[i][j] = -1;

        return calculate(0, 0);
    }

    private int calculate(int i, int j) {
        if (i >= this.h || j >= this.w)
            return Integer.MAX_VALUE;

        if (dp[i][j] != -1)
            return dp[i][j];

        if (i == this.h - 1 && j == this.w - 1)
            return dungeon[i][j] > 0 ? 1 : Math.abs(dungeon[i][j]) + 1;

        return dp[i][j] = Math.max(1, Math.min(calculate(i, j + 1), calculate(i + 1, j)) - dungeon[i][j]);
    }

}