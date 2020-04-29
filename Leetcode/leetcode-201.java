class Solution {
    /*
     * we can reformulate the problem as given two integer numbers, we are asked to
     * find the common prefix of their binary strings.
     */
    public int rangeBitwiseAnd(int m, int n) {
        int shift = 0;
        if (m == 0)
            return 0;

        // find the common prefix, which is, right shift
        // till the two numbers are equal
        while (m != n) {
            m >>= 1;
            n >>= 1;
            shift++;
        }

        // return the number by left shifting to original position
        return m << shift;
    }
}