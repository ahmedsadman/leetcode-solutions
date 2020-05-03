enum Index {
    UNKNOWN, GOOD, BAD
};

class Solution {
    private int[] nums;
    private Index[] memo;

    public boolean canJump(int[] nums) {
        this.nums = nums;
        this.memo = new Index[nums.length];

        for (int i = 0; i < nums.length; i++)
            this.memo[i] = Index.UNKNOWN;

        return helper(0);
    }

    private boolean helper(int position) {
        if (position == nums.length - 1)
            return true;

        if (memo[position] != Index.UNKNOWN) {
            return (memo[position] == Index.GOOD) ? true : false;
        }
        // stores the index that we will be in after doing the max jump
        // ex: [3, 2, 1, 0, 4], furthestJump = 3, position = 1
        // .......|
        // ......3 -> we will be at index 3 after doing 2 jumps from here
        int furthestJump = Math.min(position + nums[position], nums.length - 1);

        for (int nextPosition = position + 1; nextPosition <= furthestJump; nextPosition++) {
            if (helper(nextPosition)) {
                // can go to last index from current position
                memo[position] = Index.GOOD;
                return true;
            }
        }

        memo[position] = Index.BAD;
        return false;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = { 2, 3, 1, 0, 4 };
        System.out.println(sol.canJump(arr));
    }
}