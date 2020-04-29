import java.util.*;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int result = 0;

        Arrays.sort(g);
        Arrays.sort(s);

        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < s.length; j++) {
                if (s[j] >= g[i]) {
                    result++;
                    s[j] = -1;
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] g = { 7, 8, 9, 10 };
        int[] s = { 5, 6, 7, 8 };
        System.out.println(sol.findContentChildren(g, s));
    }
}