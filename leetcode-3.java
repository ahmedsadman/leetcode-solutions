class Solution {

    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int ans = 0;
        int n = s.length();

        Set<Character> set = new HashSet<>();

        // It is called sliding-window solution [i, j)
        while (i < n && j < n) {
            if (!set.contains(s.charAt(j))) {
                // unique character, so add it
                set.add(s.charAt(j++));

                // do the calculation for maximum
                ans = Math.max(ans, j - i);

            } else {
                /*
                 * smassma Duplicate found. Update the sliding window by removing the previous
                 * occurence of the duplicate character. For example "sma(s)ma" ; the bracket
                 * represents current iteration position (j = 3). Note that 's' already occured
                 * at the beginning (i = 0). This concludes that we found the maximum substring
                 * for i = 0 (i = 0, j = 3, ans = j - i = 3). Now we have to go for i = 1. But
                 * to treat the new substring as unique, we need to remove 's' (i = 0) from the
                 * Set first, so that no interference occurs from previous results
                 */
                set.remove(s.charAt(i++));
            }
        }

        return ans;
    }
}