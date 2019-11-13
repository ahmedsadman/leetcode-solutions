/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {

    public int firstBadVersion(int n) {

        int left = 1;
        int right = n;
        int badVersion = n;

        // do binary search
        while (left <= right) {
            int midpoint = left + (right - left) / 2;

            if (isBadVersion(midpoint))
                right = midpoint - 1;
            else
                left = midpoint + 1;

            if (isBadVersion(left))
                badVersion = Math.min(badVersion, left);
        }

        return badVersion;
    }
}