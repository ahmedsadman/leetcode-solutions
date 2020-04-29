// https://www.youtube.com/watch?v=LPFhl65R7ww

class Solution {
    public double findMedianSortedArrays(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;

        if (m > n) {
            return findMedianSortedArrays(B, A);
        }

        int iMin = 0;
        int iMax = m;
        int halflen = (m + n + 1) / 2;

        while (iMin <= iMax) {
            int i = (iMax + iMin) / 2;
            int j = halflen - i;

            if (i < iMax && B[j - 1] > A[i]) {
                iMin = i + 1;
            } else if (i > iMin && A[i - 1] > B[j]) {
                iMax = i - 1;
            } else {
                // handle edge cases when i-1 or j-1 doesn't exist (because i == 0 || j == 0)
                int maxLeft = 0;
                if (i == 0)
                    maxLeft = B[j - 1];
                else if (j == 0)
                    maxLeft = A[i - 1];
                else
                    maxLeft = Math.max(B[j - 1], A[i - 1]);

                if ((m + n) % 2 == 1)
                    return maxLeft;

                int minRight = 0;
                if (i == m)
                    minRight = B[j];
                else if (j == n)
                    minRight = A[i];
                else
                    minRight = Math.min(B[j], A[i]);

                return (maxLeft + minRight) / 2.0;
            }
        }

        return 0;
    }
}