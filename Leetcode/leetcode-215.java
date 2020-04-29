import java.util.*;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        for (int i = 0; i < nums.length; i++) {
            maxHeap.add(nums[i]);
        }

        while (k-- > 1) {
            maxHeap.remove();
        }

        return maxHeap.remove();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = { 3, 2, 1, 5, 6, 4 };
        sol.findKthLargest(nums, 2);
    }
}