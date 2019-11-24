class Solution {
    public int longestOnes(int[] A, int K) {
        int i = 0;
        int j = 0;

        for (j = 0; j < A.length; j++) {
            if (A[j] == 0)
                K--;
            if (K < 0 && A[i++] == 0)
                K++;
        }

        return j - i;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = { 0, 1, 0, 1, 0, 0, 1 };
        sol.longestOnes(arr, 1);
    }
}