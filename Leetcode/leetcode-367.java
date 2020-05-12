class Solution {
    /*
     * A square is sum of this form 1+3+5+7+9...
     */
    public boolean isPerfectSquare(int num) {
        int i = 1;

        while (num > 0) {
            num -= i;
            i += 2;
        }

        return num == 0;
    }
}