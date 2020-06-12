class Solution {
    /*
     * This problem is know as 'Dutch national flag problem' and was propsed by
     * Dijkstra
     * 
     * It's actually a dual-pivot partitioning sub-routine of quick sort algorithm
     */
    public void sortColors(int[] nums) {
        int lo = 0;
        int hi = nums.length - 1;
        int i = 0;

        while (i <= hi) {
            if (nums[i] == 0)
                swap(nums, i++, lo++);
            else if (nums[i] == 2)
                swap(nums, i, hi--);
            else
                i++;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}