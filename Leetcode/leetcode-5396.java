class Solution {
    public int maxPower(String s) {
        int l = 0;
        int r = 1;
        int len = s.length();
        int max = 1;

        while (l < len && r < len) {
            if (s.charAt(l) != s.charAt(r))
                l++;
            else
                r++;
            max = Math.max(max, r - l);
        }

        return max;
    }
}