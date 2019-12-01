class Solution {
    public boolean isAnagram(String s, String t) {
        int[] diff = new int[26];

        if (s.length() != t.length())
            return false;

        for (int i = 0; i < s.length(); i++) {
            diff[s.charAt(i) - 'a']++;
            diff[t.charAt(i) - 'a']--;
        }

        for (int count : diff) {
            if (count != 0)
                return false;
        }

        return true;
    }
}