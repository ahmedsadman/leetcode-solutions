class Solution {
    public boolean checkInclusion(String s1, String s2) {
        /* Explanation is similar to Leetcode - 438 */
        List<Integer> list = new ArrayList<>();
        int left = 0;
        int right = 0;
        int[] hash = new int[256]; // to store letter count
        int count = s1.length();

        // fill up the hash data
        for (char c : s1.toCharArray()) {
            hash[c]++;
        }

        while (right < s2.length()) {
            if (hash[s2.charAt(right++)]-- >= 1)
                count--;

            if (count == 0)
                return true;

            if (right - left == s1.length() && hash[s2.charAt(left++)]++ >= 0)
                count++;
        }

        return false;
    }
}