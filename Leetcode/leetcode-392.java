import java.util.*;

class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0)
            return true;

        int i = 0;
        int counter = 0;

        while (i < t.length()) {
            if (t.charAt(i) == s.charAt(counter))
                counter++;

            i++;

            if (counter == s.length())
                return true;
        }

        return false;
    }
}