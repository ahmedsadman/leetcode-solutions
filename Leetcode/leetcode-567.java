class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // same as leetcode 438
        int left = 0;
        int right = 0;
        int count = s1.length();
        int len = s2.length();
        int[] map = new int[256];
        
        // fill the map
        for (int i = 0; i < s1.length(); i++)
            map[s1.charAt(i)]++;
        
        while (right < len) {
            // if contains a character from s1, decrement count
            if (map[s2.charAt(right)] >= 1)
                count--;
            
            // decrase used value and move right
            map[s2.charAt(right)]--;
            right++;
            
            // check for answer
            if (count == 0)
                return true;
            
            // if boundary is crossed, move left pointer
            if (right - left == s1.length()) {
                // restoration
                if (map[s2.charAt(left)] >= 0)
                    count++;
                map[s2.charAt(left)]++;
                
                left++;
            }
            
        }
        
        return false;
    }
}