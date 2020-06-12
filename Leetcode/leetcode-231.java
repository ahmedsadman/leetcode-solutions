class Solution {
    public boolean isPowerOfTwo(int n) {
        int onesCount = 0;
        if (n < 0)
            return false;

        // in binary, n will have exactly one '1' bit if power of two
        for (int i = 0; i < 32; i++) {
            if (((n >> i) & 1) == 1)
                ++onesCount;
        }

        return onesCount == 1;
    }
}