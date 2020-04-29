class Solution {
    public int findMaxConsecutiveOnes(int[] A) {
        int i = 0;
        int j = 0;
        int max = 0;

        if (A == null || A.length == 0)
            return 0;

        while (i < A.length && j < A.length) {
            if (A[j] == 0) {
                // condition doesn't match, move sliding window to new position
                j = ++i; // inrecemnt i, then reset j and i in same pos
            } else {
                // condition match, increase window
                ++j;
                max = Math.max(max, j - i);
            }
        }
        return max;
    }
}