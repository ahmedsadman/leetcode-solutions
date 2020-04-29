
// https://leetcode.com/discuss/interview-question/602200/maximum-enclosed-points-with-distinct-tags
import java.util.*;

class Solution {
    public int solution(String S, int[] X, int[] Y) {
        int maxRadius = Integer.MAX_VALUE;
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < S.length(); i++) {
            Character tag = S.charAt(i);
            int distance = X[i] * X[i] + Y[i] * Y[i];

            if (!map.containsKey(tag)) {
                map.put(tag, distance);
            } else {
                if (distance <= map.get(tag)) {
                    // exlude the point (tag) from max radius
                    maxRadius = Math.min(maxRadius, map.get(tag) - 1);
                    // update to the new minimum
                    map.put(tag, distance);
                } else {
                    // exclude this point from max radius
                    maxRadius = Math.min(maxRadius, distance - 1);
                }
            }
        }

        // in 2nd pass, check which points fall under the optimal radius
        for (int i = 0; i < S.length(); i++) {
            int distance = X[i] * X[i] + Y[i] * Y[i];
            if (distance <= maxRadius)
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String s1 = "ABDCA";
        int[] x1 = { 2, -1, -4, -3, 3 };
        int[] y1 = { 2, -2, 4, 1, -3 };

        String s2 = "ABB";
        int[] x2 = { 1, -2, -2 };
        int[] y2 = { 1, -2, 2 };

        String s3 = "CCD";
        int[] x3 = { 1, -1, 2 };
        int[] y3 = { 1, -1, -2 };

        System.out.println(sol.solution(s1, x1, y1));
        System.out.println(sol.solution(s2, x2, y2));
        System.out.println(sol.solution(s3, x3, y3));
    }
}