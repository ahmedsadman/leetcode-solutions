import java.util.*;
// https://www.youtube.com/watch?v=LDFZm4iB7tA

class Solution {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> maxD = new ArrayDeque<>();
        Deque<Integer> minD = new ArrayDeque<>();
        int ans = 1;
        int l = 0;

        for (int r = 0; r < nums.length; r++) {
            while (!maxD.isEmpty() && nums[r] > maxD.peekLast())
                maxD.pollLast();
            while (!minD.isEmpty() && nums[r] < minD.peekLast())
                minD.pollLast();

            maxD.add(nums[r]);
            minD.add(nums[r]);

            if (maxD.peek() - minD.peek() > limit) {
                if (maxD.peek() == nums[l])
                    maxD.poll();
                if (minD.peek() == nums[l])
                    minD.poll();
                l++;
            }

            ans = Math.max(ans, r - l + 1);
        }

        return ans;
    }
}