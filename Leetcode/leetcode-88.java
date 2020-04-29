import java.util.*;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // append nums2 to the end of nums1
        for (int i = m, j = 0; i < nums1.length; i++, j++) {
            nums1[i] = nums2[j];
        }

        Arrays.sort(nums1);
    }
}