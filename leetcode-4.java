import java.util.*;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        int total_length = nums1.length + nums2.length;
        int mid = total_length / 2;
        int p1 = 0;
        int p2 = 0;
        int count = 0;

        while (p1 < nums1.length && p2 < nums2.length && count++ <= mid) {
            if (nums1[p1] < nums2[p2]) {
                stack.push(nums1[p1]);
                p1++;
            } else {
                stack.push(nums2[p2]);
                p2++;
            }
        }

        if (count <= mid) {
            if (p1 < nums1.length) {
                for (int i = p1; p1 < nums1.length && count++ <= mid; i++) {
                    stack.push(nums1[i]);
                }
            } else {
                for (int i = p2; p2 < nums2.length && count++ <= mid; i++) {
                    stack.push(nums2[i]);
                }
            }
        }

        if (total_length % 2 == 0) {
            double a = stack.pop();
            double b = stack.pop();
            // System.out.println(a);
            // System.out.println(b);
            return (a + b) / 2;
        } else {
            return stack.pop();
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = { 1, 3 };
        int[] nums2 = { 2 };
        double result = sol.findMedianSortedArrays(nums1, nums2);
        System.out.println(result);
    }
}