class Solution {
    private String text1;
    private String text2;
    private int[][] memo;

    public int longestCommonSubsequence(String text1, String text2) {
        this.text1 = text1;
        this.text2 = text2;
        this.memo = new int[text1.length() + 1][text2.length() + 1];

        // only intiailize -1 to of the two text's length
        // rest will be 0. This is helpful for base case handling later
        for (int i = 0; i < this.text1.length(); i++)
            for (int j = 0; j < this.text2.length(); j++)
                memo[i][j] = -1;

        return this.solve(0, 0);
    }

    private int solve(int i1, int i2) {
        // also handles base case like i1 == text1.length() || i2 == text2.length()
        // it's because those points like memo[text1.length()][text2.length()] == 0
        if (memo[i1][i2] != -1)
            return memo[i1][i2];

        int ans = 0;

        if (this.text1.charAt(i1) == this.text2.charAt(i2))
            ans = 1 + solve(i1 + 1, i2 + 1);
        else
            ans = Math.max(solve(i1, i2 + 1), solve(i1 + 1, i2));

        memo[i1][i2] = ans;
        return ans;
    }
}