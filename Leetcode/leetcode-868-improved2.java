class Solution {
    /*
     * The idea is same as before, except, we don't use any extra array. As we just
     * count the max of two consecutive elems, we just need to remember the last
     * index
     */

    public int binaryGap(int N) {
        int last = -1;
        int count = 0;

        for (int i = 0; i < 32; i++) {
            if (((N >> i) & 1) == 1) {
                if (last >= 0)
                    count = Math.max(count, i - last);
                last = i;
            }
        }

        return count;
    }
}