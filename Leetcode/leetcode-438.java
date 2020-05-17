import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int[] hash = new int[256];

        for (int i = 0; i < p.length(); i++)
            hash[p.charAt(i)]++;

        int left = 0;
        int right = 0;
        int strLen = s.length();
        int count = p.length();

        while (right < strLen) {
            // if the character exists in p's hash, decrease the count
            if (hash[s.charAt(right)] >= 1)
                count--;

            // decrease the used value and always move right
            hash[s.charAt(right)]--;
            right++;

            // we have found an answer
            if (count == 0)
                result.add(left);

            // we narrow the window when window size is equals p
            if (right - left == p.length()) {
                // reset count and hash value
                // NOTE: according to anagrams, containing character count will never reach
                // below 0
                if (hash[s.charAt(left)] >= 0)
                    count++;
                hash[s.charAt(left)]++;
                left++;
            }
        }

        return result;
    }
}