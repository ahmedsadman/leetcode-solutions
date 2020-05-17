class Solution {
    // https://leetcode.com/problems/maximum-sum-circular-subarray/discuss/178422/One-Pass
    public int maxSubarraySumCircular(int[] A) {
        int total = 0;
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;
        int curMax = 0;
        int curMin = 0;

        for (int num : A) {
            total += num;
            curMax = Math.max(curMax + num, num);
            maxSum = Math.max(maxSum, curMax);
            curMin = Math.min(curMin + num, num);
            minSum = Math.min(curMin, minSum);
        }

        /*
         * Corner case: In case that all interger are negative, then, maxSum = max(A)
         * and minSum = sum(A). We need to return the max(A), instead of sum of am empty
         * subarray. max(maxSum, total - minSum) = 0 in this case.
         */
        return maxSum > 0 ? Math.max(maxSum, total - minSum) : maxSum;
    }
}