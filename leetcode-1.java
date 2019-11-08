class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> record = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (record.containsKey(complement)) {
                return new int[] { i, record.get(complement) };
            }
            record.put(nums[i], i);
        }

        throw new IllegalArgumentException("No solution");
    }
}