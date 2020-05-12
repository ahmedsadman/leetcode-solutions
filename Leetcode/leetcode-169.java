/*
One obvious way to solve this is using hashmap. But we 
have a better algorithm with O(1) space and O(n) time
complexity. It's called "Moore's voting algorithm"

Algorithm Explained here: https://www.youtube.com/watch?v=n5QY3x_GNDg
*/

class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        // find the possible candidate
        for (int num : nums) {
            if (count == 0)
                candidate = num;
            count += (candidate == num) ? 1 : -1;
        }

        // as we're assured that majority element always exists in this case,
        // so we don't need to verify
        return candidate;
    }
}