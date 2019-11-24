class Solution {
    public int findMaxConsecutiveOnes(int[] A) {
        int max = 0;
        int sum = 0;

        if (A == null || A.length == 0)
            return 0;

        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            if (A[i] == 0)
                sum = 0; // reset sum
            else
                max = Math.max(max, sum);
        }

        return max;
    }
}