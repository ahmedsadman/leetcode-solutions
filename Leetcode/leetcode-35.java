// LeetCode 35 - Search Insert Position

class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int midpoint = 0;
        // do binary search

        while (left <= right) {
            midpoint = left + (right - left) / 2;

            if (nums[midpoint] == target)
                return midpoint;
            else if (nums[midpoint] < target)
                left = midpoint + 1;
            else
                right = midpoint - 1;
        }

        return nums[midpoint] > target ? midpoint : midpoint + 1;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = { 1, 3, 5, 6 };
        System.out.println(sol.searchInsert(nums, 7));
    }
}