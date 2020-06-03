class Solution {
    // Explanation:
    // https://leetcode.com/problems/counting-bits/discuss/270693/Intermediate-processsolution-for-the-most-voted-solution-i.e.-no-simplificationtrick-hidden
    public int[] countBits(int num) {
        int[] result = new int[num + 1];
        result[0] = 0;

        for (int i = 1; i <= num; i++) {
            if ((i & 1) == 0)
                result[i] = result[i >> 1];
            else
                result[i] = result[i - 1] + 1;
        }

        return result;
    }
}