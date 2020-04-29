import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(); // count, index
        int count = 0;
        int maxlen = 0;

        /*
         * Edge case. When we encounter count = 0, we need some index value to work on
         * (-1). Putting this -1 will mathematically return the correct length of the
         * longest subarray. Run with example [0, 1] for better understanding
         */
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            count += nums[i] == 1 ? 1 : -1;
            if (map.containsKey(count))
                maxlen = Math.max(maxlen, i - map.get(count));
            else
                map.put(count, i);
        }

        return maxlen;
    }
}