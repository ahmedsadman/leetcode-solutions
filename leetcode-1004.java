class Solution {
    public int longestOnes(int[] A, int K) {
        int i = 0;
        int j = 0;
        int max = 0;
        int tempK = K;

        if (A == null || A.length == 0)
            return 0;

        while (i < A.length && j < A.length) {
            if (A[j] == 0) {
                // condition doesn't match, move sliding window to new position
                if (tempK > 0) {
                    // we can still swap 1 for 0, so increase window
                    ++j;
                    max = Math.max(max, j - i);
                    --tempK;
                    continue;
                }
                tempK = K;
                j = ++i; // inrecemnt i, then reset j and i in same pos
            } else {
                // condition match, increase window
                ++j;
                max = Math.max(max, j - i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = { 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1 };
        sol.longestOnes(arr, 3);
    }
}