class Solution {
    public void moveZeroes(int[] nums) {
        int lastNonZero = 0;

        // if current element is non-zero, then apppend it
        // just after the last non-zero element
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                nums[lastNonZero++] = nums[i];
        }

        // fill the remaining positions with zeros
        for (int i = lastNonZero; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}