class Solution {
    public int binaryGap(int N) {
        int[] A = new int[32];
        int t = 0;
        int count = 0;

        // we store the index of 1's (from reverse)
        // for example N = 22 = 0b10110, then A = [1, 2, 4]
        for (int i = 0; i < 32; i++) {
            if (((N >> i) & 1) == 1)
                A[t++] = i;
        }

        // now we just count the max of two consecutive elem of A
        for (int i = 1; i < t; i++)
            count = Math.max(count, A[i] - A[i - 1]);

        return count;
    }
}